package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class CarShop {

    private Service service;
    private CarFactory carFactory;

    public CarShop(Service service, CarFactory carFactory) {
        this.service = service;
        this.carFactory = carFactory;
    }

    public Car orderCar(Color color, Model model, int yearOfIssue,
                          WheelSize wheelSize, EngineVolume engineVolume, OptionList optionList) {
        System.out.println(carFactory.createCar(color, model, yearOfIssue, wheelSize, engineVolume, optionList));
        return carFactory.createCar(color, model, yearOfIssue, wheelSize, engineVolume, optionList);
    }

}