package Homework_from_Roman.hw6New;

import java.util.*;


import static Homework_from_Roman.hw6New.Country.country;
import static Homework_from_Roman.hw6New.Main.ROBOT;



public class Factory {
    private final Random RANDOM = new Random();

    protected final List<Robot> storage = new ArrayList<>();
    protected static int step = 0;



    public void setRobotParts() {
        while (country) {
            try {
                    synchronized (ROBOT) {
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

//    public void checkStorageElement(List<Robot> temp) {
//        for (Robot element : storage) {
//            if(temp.contains(element))
//                temp.remove(element);
//        }
//
//    }

















}
