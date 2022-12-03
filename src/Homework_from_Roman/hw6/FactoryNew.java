package Homework_from_Roman.hw6;

import java.util.*;

public class FactoryNew {

    private final Random RANDOM = new Random();
    private final List<Robot> ROBOT = List.of(
            Robot.LEFT_HAND, Robot.RIGHT_HAND,
            Robot.LEFT_LEG, Robot.RIGHT_LEG,
            Robot.BODY, Robot.HEAD);
    private final List<Robot> storage = new ArrayList<>();
    private final List<Robot> robotPartsCountry = List.of(
            Robot.LEFT_HAND, Robot.RIGHT_HAND,
            Robot.LEFT_LEG, Robot.RIGHT_LEG,
            Robot.BODY, Robot.HEAD);

public void need() {
    System.out.println("Армии 1 нужно " + robotPartsCountry);
}
    public void getRobotParts(Robot robot) {
        robotPartsCountry.remove(robot);
        System.out.println(robotPartsCountry);
    }

    public void setMessage() {
        System.out.println("Армия 1 ничего не берёт");
    }

    //    createRobotParts
    public void createRobotParts() {
        while(true) {
            try {
                    synchronized (storage) {
                        storage.add(ROBOT.get(RANDOM.nextInt(6)));
                        for(Robot element : robotPartsCountry) {
                            if(storage.contains(element)) {
                                storage.remove(element);
                                getRobotParts(element);
                            }
                        }


                        System.out.println("Склад частей робота на заводе: " + storage);
                    }
                    Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
