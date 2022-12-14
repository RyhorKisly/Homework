package Homework_from_Roman.course.cars;

import Homework_from_Roman.course.enums.Option;
import Homework_from_Roman.course.enums.enumMercedes.*;

import java.util.Set;

public class Mercedes extends Car {

    private WheelDrive wheelDrive;

    public Mercedes(int year, ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes color,
                    WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
       super (year, model, engineVolume, color, wheelSize, option);
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
        return "Mercedes {" +
                super.toString() +
                ", wheelDrive=" + wheelDrive +
                '}';
    }

}
