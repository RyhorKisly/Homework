package Homework_from_Roman.hw4.cars;

import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.enumAudi.*;

import java.util.Set;

public class Audi extends Car{

    private final Transmission transmission;

    public Audi(int year, ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi color, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Audi {" +
                super.toString() +
                ", transmission=" + transmission +
                '}';
    }
}
