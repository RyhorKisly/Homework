package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.commonFields.*;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.WheelDrive;

import java.util.Set;

public class Mercedes extends Car{

    WheelDrive wheelDrive;

    public Mercedes(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.wheelDrive = wheelDrive;
    }
}
