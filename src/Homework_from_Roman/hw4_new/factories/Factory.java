package Homework_from_Roman.hw4_new.factories;

import Homework_from_Roman.hw4_new.cars.Car;
import Homework_from_Roman.hw4_new.enums.*;

import java.util.Arrays;
import java.util.Set;

import static java.lang.String.format;

public abstract class Factory<M, E, C, W, S> {

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

    public abstract Car createCar(M model, E engineVolume, C colour, W wheelSize, Set<Option> option, S specialOptions);

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
