package Homework_from_Roman.hw3.service;

import Homework_from_Roman.hw3.models.Car;
import Homework_from_Roman.hw3.models.enums.*;



public class Service {

        public void changeColor(Car car, Color color) {
            if (car != null && color != null && !color.equals(car.getColor())) {
                car.setColor(color);
            }
        }

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            car.setWheelSize(wheelSize);
        }
    }

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
