package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.cars.Mercedes;
import Homework_from_Roman.hw4.enums.Colour;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.WheelSize;
import Homework_from_Roman.hw4.enums.enumMercedes.WheelDrive;


public abstract class Service {

        public void changeColor(Car car, Colour colour) {

        }

    public void changeWheels(Car car, WheelSize wheelSize) {

    }

    public void addOption(Car car, Option option) {

    }

    public void deleteOption(Car car, Option option) {

    }

    public void changeWheelDrive(Mercedes mercedes, WheelDrive wheelDrive) {

    }

}
