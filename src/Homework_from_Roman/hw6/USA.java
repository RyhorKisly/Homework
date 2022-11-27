package Homework_from_Roman.hw6;


import java.util.ArrayList;
import java.util.List;

public class USA {

    private static List<Robot> robot = new ArrayList<>();
    private int robots = 1;

    Store store;

    public USA(Store store) {
        this.store = store;
    }

    public List<Robot> createRobot () {
        while(robot.size() < 6) {
            robot.add(Store.createPartOfRobot());
        }
        return robot;
    }

    public void accumulateRobots() {
        try {
        while (robots <= 20) {
            createRobot();
            System.out.println("Created: " + robots++ + " robot(s)");
                Thread.sleep(500);
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("USA produced 20 robots");
    }

//    public void run() {
//        for (int i = 1; i < 6; i++) {
//            store.get();
//        }
//    }

















//    private static void consume() {
//        try {
//            while (consumer) {
//                synchronized (BUFFER) {
//                    while (BUFFER.size() == 0) {
//                        BUFFER.wait();
//                    }
//                    Thread.sleep(400);
//                    Integer value = BUFFER.poll();
//                    System.out.println("Consumer consumed: " + value);
//                    if (value != null && value == 10) {
//                        consumer = false;
//                    }
//                    BUFFER.notify();
//                }
//            }
//        } catch (InterruptedException ignored) {}
//    }

}
