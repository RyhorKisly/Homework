package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.commonFields.*;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.Transmission;

import java.util.Set;

public class Audi extends Car{

    Transmission transmission;

    public Audi(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> option, Transmission transmission) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.transmission = transmission;
    }
}
