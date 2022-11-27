package Homework_from_Roman.hw6;

import java.util.*;

public class Store {

    public static void main(String[] args) {

        Thread store = new Thread(Store::produceRobot);
        store.start();
    }

    private static Robot pratOfRobot;
    private static final Random RANDOM = new Random();

    private static List<Robot> newRobot = new ArrayList<>();

    public  static void produceRobot() {
            while (newRobot.size() < 6) {
                createPartOfRobot();
            }
    }

    public static Robot createPartOfRobot() {
        try {
                pratOfRobot = Robot.valueOf(Robot.getPartOfRobot(RANDOM.nextInt(6)));
                if(!newRobot.contains(pratOfRobot)) {
                    newRobot.add(pratOfRobot);
                    System.out.println(newRobot);
                    Thread.sleep(500);
                    return pratOfRobot;
                }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return pratOfRobot;
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
