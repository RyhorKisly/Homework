package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.commonFields.*;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.Transmission;

import java.util.Set;

public class Audi extends Car{

    private final Transmission transmission;

    public Audi(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> option, Transmission transmission) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "year=" + super.getYear() +
                ", model=" + super.getModel() +
                ", engineVolume=" + super.getEngineVolume() +
                ", color=" + super.getColor() +
                ", wheelSize=" + super.getWheelSize() +
                ", option=" + super.getOption() +
                "transmission=" + transmission +
                '}';
    }
}
