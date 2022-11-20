package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.colours.Colour;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSize;


public class Service {

        public void changeColor(Car car, Colour color) {
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
