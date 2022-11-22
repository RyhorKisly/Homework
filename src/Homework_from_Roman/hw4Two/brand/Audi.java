package Homework_from_Roman.hw4Two.brand;

import Homework_from_Roman.hw4Two.brand.enums.Option;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.ColourAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.EngineVolumeAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.ModelAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.WheelSizeAudi;
import Homework_from_Roman.hw4.brand.enums.enumAudi.Transmission;

import java.util.Set;

public class Audi extends Car {

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
