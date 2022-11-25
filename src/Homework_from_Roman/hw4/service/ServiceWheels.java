package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.cars.Car;

import Homework_from_Roman.hw4.enums.WheelSize;
import Homework_from_Roman.hw4.enums.enumAudi.ColourAudi;
import Homework_from_Roman.hw4.enums.enumAudi.WheelSizeAudi;
import Homework_from_Roman.hw4.enums.enumBMW.ColourBMW;
import Homework_from_Roman.hw4.enums.enumBMW.WheelSizeBMW;
import Homework_from_Roman.hw4.enums.enumMercedes.ColourMercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.WheelSizeMercedes;
import Homework_from_Roman.hw4.exeptions.WrongWheelSizeException;

import java.util.Arrays;

public class ServiceWheels implements Service{

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
