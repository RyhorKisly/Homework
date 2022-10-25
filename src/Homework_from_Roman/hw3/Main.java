package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(Color.RED, Model.RAPID, YearOfIssue.NEW,
                WheelSize.BIG, EngineVolume.BIG_VOLUME, OptionList.LEATHER_SEATS);

        System.out.println(car);

        Service service = new Service();
        service.addOption(car, OptionList.AUTOMATIC_TRANSMISSION);

        System.out.println(car);

        service.deleteOption(car, OptionList.AUTOMATIC_TRANSMISSION);

        System.out.println(car);

        service.changeWheelSize(car, WheelSize.MEDIUM);

        System.out.println(car);

        CarFactory carFactory = new CarFactory(service);

    }
}
