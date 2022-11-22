package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.Option;

public class ServiceOption extends Service{

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
