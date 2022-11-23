package Homework_from_Roman.hw4.cars;

import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.enumMercedes.ColourMercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.EngineVolumeMercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.ModelMercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.WheelDrive;
import Homework_from_Roman.hw4.enums.enumMercedes.WheelSizeMercedes;

import java.util.Set;

public class Mercedes extends Car{

    private WheelDrive wheelDrive;

    public Mercedes(int year, ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes color, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        super(year, model, engineVolume, color, wheelSize, option);
        this.wheelDrive = wheelDrive;
    }

    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }

    public void setWheelDrive(WheelDrive wheelDrive) {
        this.wheelDrive = wheelDrive;
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
