package Homework_from_Roman.hw4_new.specialOptions;

import Homework_from_Roman.hw4_new.enums.enumBMW.DiscBrakes;
import Homework_from_Roman.hw4_new.enums.enumBMW.FuelType;

public class SpecialOptionsBMW {

    private DiscBrakes discBrakes;
    private FuelType fuelType;

    public SpecialOptionsBMW(DiscBrakes discBrakes, FuelType fuelType) {
        this.discBrakes = discBrakes;
        this.fuelType = fuelType;
    }

    public DiscBrakes getDiscBrakes() {
        return discBrakes;
    }

    public void setDiscBrakes(DiscBrakes discBrakes) {
        this.discBrakes = discBrakes;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public FuelType setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
        return fuelType;
    }
}
