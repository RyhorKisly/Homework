package Homework_from_Roman.hw6New;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Homework_from_Roman.hw6New.Factory.ROBOT;
import static Homework_from_Roman.hw6New.Factory.step;

public class Country {

    private static final Integer LIMIT_OF_ROBOTS_FOR_ARMY = 20;
    protected static boolean country = true;
    private List<Robot> temp = new ArrayList<>(List.of(
            Robot.LEFT_HAND, Robot.RIGHT_HAND,
            Robot.LEFT_LEG, Robot.RIGHT_LEG,
            Robot.BODY, Robot.HEAD));
    private List<Robot> robot = new ArrayList<>();
    private List<List<Robot>> army = new ArrayList<>();

    private int counterOfRobotParts;
    private int counterForArmy;
    private Factory factory;
    private String nameOfCountry;

    public Country(Factory factory, String nameOfCountry) {
        this.factory = factory;
        this.nameOfCountry = nameOfCountry;
    }

    public void getArmy() {
        while (country) {
            synchronized (factory.storage) {
                if (counterOfRobotParts < 6) {
                    getRobotParts();
                } else if (counterOfRobotParts == 6) {
                    getRobot();
                }
            }
        }
    }

    public void getRobotParts() {
        for (Robot element : factory.storage) {
            if (!robot.contains(element)) {
                step++;
                System.out.print("Ход " + step + ": ");
                robot.add(element);
                System.out.print("Армия " + nameOfCountry + " берет c фабрики: " + Collections.singletonList(element) + "; ");
                temp.remove(element);
                System.out.print("армии " + nameOfCountry + " нужно еще: " + temp + "; ");
                factory.factoryRemoveElement(element);
                factory.factoryHas();
                ++counterOfRobotParts;
                break;
            }
        }
    }
    public void getRobot() {
        step++;
        System.out.print("Ход " + step + ": ");
        army.add(robot);
        robot.clear();
        temp.addAll(ROBOT);
        counterOfRobotParts = 0;
        counterForArmy++;
        System.out.print("Армия " + nameOfCountry + " получила +1 робот; ");
        System.out.print("Количество роботв в армии: " + counterForArmy + "; ");
        if (counterForArmy == LIMIT_OF_ROBOTS_FOR_ARMY) {
            System.out.println(nameOfCountry + " армия готова!!!");
            country = false;
        } else {
            System.out.println("Армии " + nameOfCountry + " нужно: " + temp + ".");
        }
    }
}










