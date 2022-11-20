package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.commonFields.colors.ColorsAudi;
import Homework_from_Roman.hw4.brand.enums.commonFields.engineVolumes.EngineVolumeAudi;
import Homework_from_Roman.hw4.brand.enums.commonFields.models.ModelAudi;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.Transmission;

import java.util.Set;

public class Audi extends Car{

    private final Transmission transmission;

    public Audi(int year, ModelAudi model, EngineVolumeAudi engineVolume, ColorsAudi color, WheelSize wheelSize, Set<Option> option, Transmission transmission) {
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
