package Homework_from_Roman.course.service;

import Homework_from_Roman.course.cars.Car;
import Homework_from_Roman.course.enums.Colour;
import Homework_from_Roman.course.enums.enumAudi.ColourAudi;
import Homework_from_Roman.course.enums.enumBMW.ColourBMW;
import Homework_from_Roman.course.enums.enumMercedes.ColourMercedes;
import Homework_from_Roman.course.exeptions.WrongColourException;

import java.util.Arrays;

public class ServiceColor {

    public void changeColor(Car car, Colour colour) {
                    car.setColor(colour);
    }

}