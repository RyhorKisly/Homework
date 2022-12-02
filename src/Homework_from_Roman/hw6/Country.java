package Homework_from_Roman.hw6;

import java.util.ArrayList;
import java.util.List;

public class Country extends Thread{
    private static final Integer LIMIT = 20;
    public static boolean country = true;

    private List<List<Robot>> army = new ArrayList<>();
    private List<Robot> robot = new ArrayList<>();
    private Factory factory;

    public Country(String name, List<List<Robot>> army, List<Robot> robot, Factory factory) {
        super(name);
        this.army = army;
        this.robot = robot;
        this.factory = factory;
    }
//        Соответственно эти страны пытаются взять с завода нужные им части
//            для составления  робота (лишние не брать, то что не забрали хранится
//            на заводе).

    public void run() {
        int counterForRobot = 0;
        int counterForArmy = 0;
            while (country) {
                synchronized (factory.getStorage()) {
                    for (Robot element : factory.getStorage()) {
                        if (!robot.contains(element)) {
                            robot.add(element);
                            factory.getStorage().remove(element);
                            counterForRobot++;
                            System.out.println(Thread.currentThread().getName() + " части создаваемого робота: " + robot);
                            break;
                        }
                    }
                    if (counterForRobot == 6) {
                        army.add(robot);
                        robot.clear();
                        counterForRobot = 0;
                        counterForArmy++;
                        System.out.println(Thread.currentThread().getName() + " армия количеством: " + counterForArmy);
                        if (counterForArmy == LIMIT) {
                            System.out.println(Thread.currentThread().getName() + " армия готова!!!");
                            country = false;
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + " начинаем создавать следующего робота");
                    }
                }
            }
    }

    public static boolean isCountry() {
        return country;
    }

    }



