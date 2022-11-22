package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.brand.Audi;
import Homework_from_Roman.hw4.brand.BMW;
import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.Mercedes;
import Homework_from_Roman.hw4.brand.enums.Colour;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.WheelSize;


public abstract class Service {

    BMW bmw;
    Audi audi;
    Mercedes mercedes;

        public void changeColor(Car car, Colour colour) {
            if (car != null && colour != null && !colour.equals(car.getColor())) {
                    car.setColor(colour);
            }
        }

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            car.setWheelSize(wheelSize);
        }
    }

    public void addOption(Car car, Option option) {

    }

    public void deleteOption(Car car, Option option) {

    }

}
