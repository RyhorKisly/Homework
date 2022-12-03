package Homework_from_Roman.hw6New;

import java.util.*;

import static Homework_from_Roman.hw6New.Country.country;

public class Factory {
    private final Random RANDOM = new Random();
    protected static final List<Robot> ROBOT = List.of(
            Robot.LEFT_HAND, Robot.RIGHT_HAND,
            Robot.LEFT_LEG, Robot.RIGHT_LEG,
            Robot.BODY, Robot.HEAD);
    protected final List<Robot> storage = new ArrayList<>();
    protected static int step = 0;



    public void factorySetRobotParts() {
        while (country) {
            try {
                    synchronized (storage) {
                        int x = RANDOM.nextInt(6);
                        step++;
                        System.out.print("Ход " + step + ": ");
                        storage.add(ROBOT.get(x));
                        System.out.print("Фабрикика генерирует: " + Collections.singletonList(ROBOT.get(x)) + "; ");
                        System.out.println("на фабрике есть: " + storage);
                    }
                Thread.sleep(10);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void factoryRemoveElement(Robot element) {
        storage.remove(element);
    }

    public void factoryHas() {
        System.out.println("на фабрике есть: " + storage);
    }

//    public void checkStorageElement(List<Robot> robot, List<Robot> temp, int counterOfRobotParts) {
//        for (Robot element : storage) {
//            if (!robot.contains(element)) {
//                step++;
//                System.out.print("Ход " + step + ": ");
//                robot.add(element);
//                System.out.print("Армия USA берет c фабрики: " + Collections.singletonList(element) + "; ");
//                temp.remove(element);
//                System.out.print("армии USA нужно еще: " + temp + "; ");
//                factoryRemoveElement(element);
//                factoryHas();
//                ++counterOfRobotParts;
//                break;
//            }
//        }
//    }

















}
