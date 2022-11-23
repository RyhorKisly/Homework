package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.Colour;
import Homework_from_Roman.hw4.enums.enumAudi.ColourAudi;
import Homework_from_Roman.hw4.enums.enumBMW.ColourBMW;
import Homework_from_Roman.hw4.enums.enumMercedes.ColourMercedes;

public class ServiceColor extends Service{
    ColourBMW colourBMW;
    ColourAudi colourAudi;
    ColourMercedes colourMercedes;



    public void changeColor(Car car, Colour colour) {
        if (car != null && colour != null && !colour.equals(car.getColor())) {
            car.setColor(colour);
        }
    }

}
