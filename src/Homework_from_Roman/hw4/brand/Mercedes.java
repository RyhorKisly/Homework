package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.commonFields.*;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.WheelDrive;

import java.util.Set;

public class Mercedes<M, E, C, W> extends Car<M, E, C, W>{

    private final WheelDrive wheelDrive;

    public Mercedes(int year, M model, E engineVolume, C color, W wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.wheelDrive = wheelDrive;
    }

    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "year=" + super.getYear() +
                ", model=" + super.getModel() +
                ", engineVolume=" + super.getEngineVolume() +
                ", color=" + super.getColor() +
                ", wheelSize=" + super.getWheelSize() +
                ", option=" + super.getOption() +
                "wheelDrive=" + wheelDrive +
                '}';
    }
}
