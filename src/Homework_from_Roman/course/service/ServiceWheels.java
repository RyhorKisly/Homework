package Homework_from_Roman.course.service;

import Homework_from_Roman.course.cars.Car;
import Homework_from_Roman.course.enums.WheelSize;
import Homework_from_Roman.course.enums.enumAudi.WheelSizeAudi;
import Homework_from_Roman.course.enums.enumBMW.WheelSizeBMW;
import Homework_from_Roman.course.enums.enumMercedes.WheelSizeMercedes;
import Homework_from_Roman.course.exeptions.WrongWheelSizeException;

import java.util.Arrays;

public class ServiceWheels {

    public void changeWheels(Car car, WheelSize wheelSize) {
                    car.setWheelSize(wheelSize);
    }

}
