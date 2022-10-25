package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class CarShop {

    private Service service;
    private CarFactory carFactory;

    public CarShop(Service service, CarFactory carFactory) {
        this.service = service;
        this.carFactory = carFactory;
    }

    public Car orderCar(Color color, Model model, YearOfIssue yearOfIssue,
                          WheelSize wheelSize, EngineVolume engineVolume, OptionList optionList) {
        return CarFactory.createCar(color, model, yearOfIssue, wheelSize, engineVolume, optionList);
    }



}
