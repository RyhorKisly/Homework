package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.commonFields.*;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.FuelType;

import java.util.Set;

public class BMW extends Car{

    FuelType fuelType;

    public BMW(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> option, FuelType fuelType) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.fuelType = fuelType;
    }
}
