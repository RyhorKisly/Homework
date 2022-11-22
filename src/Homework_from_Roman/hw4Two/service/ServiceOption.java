package Homework_from_Roman.hw4Two.service;

import Homework_from_Roman.hw4Two.brand.Car;
import Homework_from_Roman.hw4Two.brand.enums.Option;

public class ServiceOption extends Service {

    public void addOption(Car car, Option option) {
        if (car != null && option != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null && option != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }

}
