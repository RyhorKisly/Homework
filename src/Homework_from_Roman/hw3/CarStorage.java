package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class CarStorage {

    private Car[] cars = new Car[2];
    protected static Car car1 = new Car(Color.RED, Model.RAPID, YearOfIssue.NEW,
            WheelSize.BIG, EngineVolume.BIG_VOLUME, OptionList.LEATHER_SEATS);
    protected static Car car2 = new Car(Color.BLACK, Model.OCTAVIA, YearOfIssue.NEW,
            WheelSize.MEDIUM, EngineVolume.BIG_VOLUME, OptionList.LEATHER_SEATS);

    public CarStorage() {
//        this.cars[0] = car1;
//        this.cars[1] = car2;
    }

//    public Car[] getCars() {
//        return cars;
//    }



}
