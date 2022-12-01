package Homework_from_Roman.hw6;

import java.util.*;

public class Store extends Thread {

    private static final Random RANDOM = new Random();
    private static final  List<Robot> ROBOT = List.of(
            Robot.LEFT_HAND, Robot.RIGHT_HAND,
            Robot.LEFT_LEG, Robot.RIGHT_LEG,
            Robot.BODY, Robot.HEAD);
    private static List<Robot> robotParts = new ArrayList<>();

//    createRobotParts
    public void run() {
        while(true) {
            try {
                robotParts.add(ROBOT.get(RANDOM.nextInt(6)));
                Thread.sleep(1000);
                System.out.println(robotParts);
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
