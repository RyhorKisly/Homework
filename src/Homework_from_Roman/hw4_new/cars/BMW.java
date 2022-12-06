package Homework_from_Roman.hw4_new.cars;

import Homework_from_Roman.hw4_new.enums.Option;
import Homework_from_Roman.hw4_new.enums.enumBMW.*;
import Homework_from_Roman.hw4_new.specialOptions.BMWSpecialOptions;

import java.util.Set;

public class BMW extends Car {

    private final DiscBrakes discBrakes;
    private final FuelType fuelType;

    public BMW(int year, ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW color, WheelSizeBMW wheelSize, Set<Option> option, DiscBrakes discBrakes, FuelType fuelType) {
        super(year, model, engineVolume, color, wheelSize, option, new BMWSpecialOptions(discBrakes, fuelType));
        this.discBrakes = discBrakes;
        this.fuelType = fuelType;
    }

//    @Override
//    public String toString() {
//        return "BMW {" +
//                super.toString() +
//                ", BMWSpecialOptions=" + BMWSpecialOptions +
//                '}';
//    }
}
