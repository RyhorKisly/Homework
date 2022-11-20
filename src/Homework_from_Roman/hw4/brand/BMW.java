package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.colours.ColourBMW;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolumeBMW;
import Homework_from_Roman.hw4.brand.enums.models.ModelBMW;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.FuelType;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSizeBMW;

import java.util.Set;

public class BMW extends Car{

    private final FuelType fuelType;

    public BMW(int year, ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW color, WheelSizeBMW wheelSize, Set<Option> option, FuelType fuelType) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "year=" + super.getYear() +
                ", model=" + super.getModel() +
                ", engineVolume=" + super.getEngineVolume() +
                ", color=" + super.getColor() +
                ", wheelSize=" + super.getWheelSize() +
                ", option=" + super.getOption() +
                "fuelType=" + fuelType +
                '}';
    }
}
