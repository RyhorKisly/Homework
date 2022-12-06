package Homework_from_Roman.hw4.specialOptions;

import Homework_from_Roman.hw4.enums.enumBMW.DiscBrakes;
import Homework_from_Roman.hw4.enums.enumBMW.FuelType;

public class SpecialOptionsBMW implements SpecialOptions{

    private DiscBrakes discBrakes;
    private FuelType fuelType;

    public SpecialOptionsBMW(DiscBrakes discBrakes, FuelType fuelType) {
        this.discBrakes = discBrakes;
        this.fuelType = fuelType;
    }

    public DiscBrakes getDiscBrakes() {
        return discBrakes;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

}
