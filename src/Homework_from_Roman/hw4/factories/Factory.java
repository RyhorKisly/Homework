package Homework_from_Roman.hw4.factories;

import Homework_from_Roman.hw4.cars.BMW;
import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.*;
import Homework_from_Roman.hw4.enums.enumBMW.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


import static java.lang.String.format;

public abstract class Factory {

    private final Colour[] colour;
    private final Model[] model;
    private final WheelSize[] wheelSize;
    private final EngineVolume[] engineVolume;

    public Factory(Colour[] colour, Model[] model, WheelSize[] wheelSize, EngineVolume[] engineVolume) {
        this.colour = colour;
        this.model = model;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
    }

    protected abstract Car createCar(Model model, EngineVolume engineVolume, Colour colour, WheelSize wheelSize,
                                     Set<Option> option, SpecialOption specialOption);

    public String getConfigurations() {
        return format(
                Arrays.toString(colour),
                Arrays.toString(model),
                Arrays.toString(wheelSize),
                Arrays.toString(engineVolume)
        );
    }

    public abstract void fillStorageWithCars();

}
