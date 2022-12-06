package Homework_from_Roman.hw4_new.cars;

import Homework_from_Roman.hw4_new.enums.Option;
import Homework_from_Roman.hw4_new.enums.WheelSize;
import Homework_from_Roman.hw4_new.enums.enumAudi.*;

import java.util.Set;

public class Audi extends Car {

    private Transmission transmission;

    public Audi(int year, ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi color, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        super(year, model, engineVolume, color, wheelSize, option, transmission);
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Audi {" +
                super.toString() +
                ", transmission=" + transmission +
                '}';
    }
}
