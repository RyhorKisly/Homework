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
        try {
            if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
                if (Arrays.toString(WheelSizeBMW.values()).contains(wheelSize.toString()) &&
                        Arrays.toString(WheelSizeBMW.values()).contains(car.getWheelSize().toString())) {
                    car.setWheelSize(wheelSize);
                } else if (Arrays.toString(WheelSizeAudi.values()).contains(wheelSize.toString()) &&
                        Arrays.toString(WheelSizeAudi.values()).contains(car.getWheelSize().toString())) {
                    car.setWheelSize(wheelSize);
                } else if (Arrays.toString(WheelSizeMercedes.values()).contains(wheelSize.toString()) &&
                        Arrays.toString(WheelSizeMercedes.values()).contains(car.getWheelSize().toString())) {
                    car.setWheelSize(wheelSize);
                } else {
                    throw new WrongWheelSizeException("WRONG WHEEL_SIZE");
                }
            }
        } catch (WrongWheelSizeException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }

}
