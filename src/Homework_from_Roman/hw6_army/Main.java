package Homework_from_Roman.hw6_army;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String... args) throws InterruptedException {
        int armySize = 5;
        AtomicBoolean isOver = new AtomicBoolean();

        Factory factory = new Factory(isOver);
        Army holy = new Army(factory, isOver, armySize, "Holy");
        Army evil = new Army(factory, isOver, armySize, "Evil");

        Thread factoryThread = new Thread(factory::createDetail);
        Thread holyArmy = new Thread(holy::createArmy);
        Thread evilArmy = new Thread(evil::createArmy);

        factoryThread.start();
        holyArmy.start();
        evilArmy.start();

        holyArmy.join();
        evilArmy.join();
        factoryThread.join();
    }
}
