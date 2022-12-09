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
        try {
            if (car != null && colour != null && !colour.equals(car.getColor())) {
                if (Arrays.toString(ColourBMW.values()).contains(colour.toString()) &&
                        Arrays.toString(ColourBMW.values()).contains(car.getColor().toString())) {
                    car.setColor(colour);
                } else if (Arrays.toString(ColourAudi.values()).contains(colour.toString()) &&
                        Arrays.toString(ColourAudi.values()).contains(car.getColor().toString())) {
                    car.setColor(colour);
                } else if (Arrays.toString(ColourMercedes.values()).contains(colour.toString()) &&
                        Arrays.toString(ColourMercedes.values()).contains(car.getColor().toString())) {
                    car.setColor(colour);
                } else {
                    throw new WrongColourException("WRONG COLOUR");
                }
            }
        } catch (WrongColourException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }

}