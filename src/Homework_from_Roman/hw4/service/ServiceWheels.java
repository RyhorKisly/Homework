package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.brand.Car;

import Homework_from_Roman.hw4.brand.enums.WheelSize;
import Homework_from_Roman.hw4.brand.enums.enumAudi.WheelSizeAudi;
import Homework_from_Roman.hw4.brand.enums.enumBMW.WheelSizeBMW;
import Homework_from_Roman.hw4.brand.enums.enumMercedes.WheelSizeMercedes;

public class ServiceWheels extends Service{

    WheelSizeBMW wheelSizeBMW;
    WheelSizeAudi wheelSizeAudi;
    WheelSizeMercedes wheelSizeMercedes;

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            if(car == bmw && wheelSize == wheelSizeBMW) {
                car.setWheelSize(wheelSize);
            } else if (car == audi && wheelSize == wheelSizeAudi) {
                car.setWheelSize(wheelSize);
            } else if (car == mercedes && wheelSize == wheelSizeMercedes) {
                car.setWheelSize(wheelSize);
            } else {
                System.out.println("Колёса не поменяли, выберите колёся определённой марки");
            }
        }
    }

}
