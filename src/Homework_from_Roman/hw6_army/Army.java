package Homework_from_Roman.hw6_army;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Army {

    private final String name;
    private final int armySize;
    private final Factory factory;
    private final AtomicBoolean isOver;
    private final List<Robot> currentInProgress = new ArrayList<>();

    private int readyCount = 0;

    public Army(Factory factory, AtomicBoolean isOver, Integer armySize, String name) {
        this.name = name;
        this.isOver = isOver;
        this.factory = factory;
        this.armySize = armySize;
        Collections.addAll(currentInProgress, Robot.values());
    }

    public void createArmy() {
        while (!isOver.get()) {
                List<Robot> details = factory.getStorageDetails(currentInProgress);
                if (!details.isEmpty()) {
                    System.out.println(name + " get details: " + details);
                    currentInProgress.removeAll(details);
                    System.out.println(name + " need details: " + currentInProgress);
                }
                if (currentInProgress.isEmpty()) {
                    ++readyCount;
                    System.out.println(name + " robots count " + readyCount);
                    if (armySize == readyCount && !isOver.get()) {
                        isOver.set(true);
                        System.out.println("Army " + name + " win!");
                        return;
                    }
                    Collections.addAll(currentInProgress, Robot.values());
                }
        }
    }

}
