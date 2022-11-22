package Homework_from_Roman.hw4Two.service;

import Homework_from_Roman.hw4Two.brand.Car;
import Homework_from_Roman.hw4Two.brand.enums.Colour;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.ColourAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumBMW.ColourBMW;
import Homework_from_Roman.hw4Two.brand.enums.enumMercedes.ColourMercedes;

public class ServiceColor extends Service {

    ColourBMW colourBMW;
    ColourAudi colourAudi;
    ColourMercedes colourMercedes;

    public void changeColor(Car car, Colour colour) {
        if (car != null && colour != null && !colour.equals(car.getColor())) {
            if(car == bmw && colour == colourBMW) {
                car.setColor(colour);
            } else if (car == audi && colour == colourAudi) {
                car.setColor(colour);
            } else if (car == mercedes && colour == colourMercedes) {
                car.setColor(colour);
            } else {
                System.out.println("Цвет не поменяли, выберите нужный цвет для данной марки");
            }
        }
    }

}
