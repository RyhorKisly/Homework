package Homework_from_Roman.hw4.cars;

import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.enumBMW.*;

import java.util.Set;

public class BMW extends Car{

    private final FuelType fuelType;

    public BMW(int year, ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW color, WheelSizeBMW wheelSize, Set<Option> option, FuelType fuelType) {
        super(year, model, engineVolume, color, wheelSize, option, fuelType);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "BMW {" +
                super.toString() +
                ", fuelType=" + fuelType +
                '}';
    }
}
