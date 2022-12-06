package Homework_from_Roman.hw4_new.cars;

import Homework_from_Roman.hw4_new.enums.Option;
import Homework_from_Roman.hw4_new.enums.enumBMW.*;
import Homework_from_Roman.hw4_new.specialOptions.SpecialOptionsBMW;

import java.util.Set;

public class BMW extends Car {

    private DiscBrakes discBrakes;
    private FuelType fuelType;

    public BMW(int year, ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW color, WheelSizeBMW wheelSize, Set<Option> option, DiscBrakes discBrakes, FuelType fuelType) {
        super(year, model, engineVolume, color, wheelSize, option, new SpecialOptionsBMW(discBrakes, fuelType));
        this.discBrakes = discBrakes;
        this.fuelType = fuelType;
    }

    public DiscBrakes getDiscBrakes() {
        return discBrakes;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
    public void setDiscBrakes(DiscBrakes discBrakes) {
        this.discBrakes = discBrakes;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "BMW {" +
                super.toString() +
                ", DiscBrakes=" + discBrakes +
                ", FuelType=" + fuelType +
                '}';
    }
}
