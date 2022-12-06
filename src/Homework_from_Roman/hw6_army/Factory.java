package Homework_from_Roman.hw6_army;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Factory {

    private final AtomicBoolean isOver;
    private static final Random RANDOM = new Random();
    private final List<Robot> storage = new ArrayList<>();

    public Factory(AtomicBoolean isOver) {
        this.isOver = isOver;
    }

    public void createDetail() {
        synchronized (storage) {
            while (!isOver.get()) {
                Robot detail = Robot.values()[RANDOM.nextInt(Robot.values().length)];

                storage.add(detail);
                System.out.println("Деталь добавлена: " + detail);

                try {
                    storage.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<Robot> getStorageDetails(List<Robot> details) {
        List<Robot> returnedDetails = new ArrayList<>();
        synchronized (storage) {
            details.forEach(d -> {
                if (storage.remove(d)) {
                    returnedDetails.add(d);
                }
            });
        }
        return returnedDetails;
    }

}
