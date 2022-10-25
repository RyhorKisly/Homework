package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class CarStorage {

    private Car[] cars = new Car[2];
    protected static Car car1 = new Car(Color.RED, Model.OCTAVIA, 2022,
            WheelSize.BIG, EngineVolume.BIG_VOLUME, OptionList.WINDSHIELD_HEATING);
    protected static Car car2 = new Car(Color.BLACK, Model.OCTAVIA, 2022,
            WheelSize.MEDIUM, EngineVolume.BIG_VOLUME, OptionList.AUTOMATIC_TRANSMISSION);

    public CarStorage() {
//        this.cars[0] = car1;
//        this.cars[1] = car2;
    }

//    public Car[] getCars() {
//        return cars;
//    }



}
