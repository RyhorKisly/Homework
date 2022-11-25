package Homework_from_Roman.hw4.factories;

import Homework_from_Roman.hw4.enums.*;
import Homework_from_Roman.hw4.enums.enumAudi.*;

import java.util.Arrays;
import java.util.Spliterator;

import static java.lang.String.format;

public class Factory {

    private static final int YEAR = 2022;
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

    public String getConfigurations() {
        return format(
                Arrays.toString(colour),
                Arrays.toString(model),
                Arrays.toString(wheelSize),
                Arrays.toString(engineVolume)
        );
    }

}
