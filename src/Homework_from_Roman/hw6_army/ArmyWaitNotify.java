package Homework_from_Roman.hw6_army;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ArmyWaitNotify {

    private static final Integer LIMIT = 5;
    private static final Random RANDOM = new Random();
    private static final LinkedList<Robot> BUFFER = new LinkedList<>();
    private static final AtomicBoolean isOver = new AtomicBoolean();
    private static final Robot[] PARTS = Robot.values();

    private static void factory() {
        try {
            synchronized (BUFFER) {
                while (!isOver.get()) {
                    Robot detail = PARTS[RANDOM.nextInt(0,6)];
                    System.out.println("Factory produced: " + detail);
                    BUFFER.add(detail);
                    BUFFER.notify();
                    BUFFER.wait(300);
                }
                BUFFER.notifyAll();
            }
        } catch (InterruptedException ignored) {}
    }

    private static void country() {
        try {
            AtomicInteger count = new AtomicInteger();
            List<Robot> needed = new ArrayList<>(Arrays.asList(PARTS));
            synchronized (BUFFER) {
                while (!isOver.get()) {
                    List<Robot> returnedDetails = new ArrayList<>();
                    needed.forEach(d -> {
                        if (BUFFER.remove(d)) {
                            returnedDetails.add(d);
                        }
                    });
                    needed.removeAll(returnedDetails);
                    System.out.println("Army " + Thread.currentThread().getName() + " consumed: " + returnedDetails);
                    if (needed.isEmpty()) {
                        int size = count.incrementAndGet();
                        System.out.println("Army " + Thread.currentThread().getName() + " Count: " + count);
                        if (size == LIMIT && !isOver.get()) {
                            isOver.set(true);
                            System.out.println("Army " + Thread.currentThread().getName() + " win!");
                            return;
                        }
                        Collections.addAll(needed, Robot.values());
                    }
                    BUFFER.wait();
                }
            }
        } catch (InterruptedException ignored) {}
    }


    public static void main(String[] args) throws InterruptedException {
        Thread factory = new Thread(ArmyWaitNotify::factory);
        Thread armyOne = new Thread(ArmyWaitNotify::country);
        Thread armyTwo = new Thread(ArmyWaitNotify::country);
        factory.start();
        armyOne.start();
        armyTwo.start();
        armyOne.join();
        armyTwo.join();
        factory.join();
    }

}
