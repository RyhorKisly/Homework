package Homework_from_Roman.hw6;

import java.util.*;

public class Factory extends Thread{

    private final Random RANDOM = new Random();
    private final  List<Robot> ROBOT = List.of(
            Robot.LEFT_HAND, Robot.RIGHT_HAND,
            Robot.LEFT_LEG, Robot.RIGHT_LEG,
            Robot.BODY, Robot.HEAD);
    private final List<Robot> storage = new ArrayList<>();

    public List<Robot> getStorage() {
        return storage;
    }

    //    createRobotParts
    public void run() {
        while(true) {
            try {
            if(Country.isCountry()) {

                    synchronized (storage) {
                        storage.add(ROBOT.get(RANDOM.nextInt(6)));
                        System.out.println("Склад частей робота на заводе: " + storage);
                    }
                    Thread.sleep(10);
            }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }






//    private static void produce() {
//        try {
//            int value = 0;
//            while (producer) {
//                synchronized (ROBOT) {
//                    while (ROBOT.size() == LIMIT) {
//                        ROBOT.wait();
//                    }
//                    Thread.sleep(400);
//                    System.out.println("Producer produced: " + ++value);
//                    ROBOT.add(value);
//                    if (value == 10) {
//                        producer = false;
//                    }
//                    ROBOT.notify();
//                }
//            }
//        } catch (InterruptedException ignored) {}
//    }

}
