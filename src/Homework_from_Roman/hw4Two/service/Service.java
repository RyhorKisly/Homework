package Homework_from_Roman.hw4Two.service;

import Homework_from_Roman.hw4Two.brand.Audi;
import Homework_from_Roman.hw4Two.brand.BMW;
import Homework_from_Roman.hw4Two.brand.Car;
import Homework_from_Roman.hw4Two.brand.Mercedes;
import Homework_from_Roman.hw4Two.brand.enums.Colour;
import Homework_from_Roman.hw4Two.brand.enums.Option;
import Homework_from_Roman.hw4Two.brand.enums.WheelSize;


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
