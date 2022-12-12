package Homework_from_Roman.course.factories;

import Homework_from_Roman.course.cars.Car;
import Homework_from_Roman.course.enums.*;
import Homework_from_Roman.course.cars.specialOptions.SpecialOptions;

import java.util.Arrays;
import java.util.Set;

import static java.lang.String.format;

public abstract class Factory<M extends Model, E extends EngineVolume, C extends Colour,
                              W extends WheelSize, S extends SpecialOptions> {

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
