package Homework_from_Roman.hw4_new.service;

import Homework_from_Roman.hw4_new.cars.Car;
import Homework_from_Roman.hw4_new.enums.Option;

public class ServiceOption implements Service {

    public void addOption(Car car, Option option) {
        try {
            if (car != null && option != null && car.getOption() != null) {
                car.getOption().add(option);
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void deleteOption(Car car, Option option) {
        try {
        if (car != null && option != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
        } catch (NullPointerException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
