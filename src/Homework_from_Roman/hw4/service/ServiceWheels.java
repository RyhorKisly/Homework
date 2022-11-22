package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.brand.Car;

import Homework_from_Roman.hw4.brand.enums.WheelSize;

public class ServiceWheels extends Service{

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            car.setWheelSize(wheelSize);
        }
    }

}
