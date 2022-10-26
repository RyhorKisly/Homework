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
                          WheelSize wheelSize, EngineVolume engineVolume, String[] arrayOptionList) {
        return carFactory.createCar(color, model, yearOfIssue, wheelSize, engineVolume, arrayOptionList);
    }

    public Car changeColor(Car car, Color color) {
        service.changeColor(car, color);
        return car;
    }

    public Car changeWheelSize(Car car, WheelSize wheelSize) {
        service.changeWheelSize(car, wheelSize);
        return car;
    }

    public Car addOption(Car car, OptionList option) {
        service.addOption(car, option);
        return car;
    }

    public Car deleteOption(Car car, OptionList option) {
        service.deleteOption(car, option);
        return car;
    }

}