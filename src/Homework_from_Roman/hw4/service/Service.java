package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.brand.Audi;
import Homework_from_Roman.hw4.brand.BMW;
import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.Mercedes;
import Homework_from_Roman.hw4.brand.enums.colours.Colour;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.colours.ColourAudi;
import Homework_from_Roman.hw4.brand.enums.colours.ColourBMW;
import Homework_from_Roman.hw4.brand.enums.colours.ColourMercedes;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSize;


public class Service {
    ColourBMW colourBMW;
    ColourAudi colourAudi;
    ColourMercedes colourMercedes;
    BMW bmw;
    Audi audi;
    Mercedes mercedes;

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

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            car.setWheelSize(wheelSize);
        }
    }

    public void addOption(Car car, Option option) {
        if (car != null && option != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null && option != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }

}
