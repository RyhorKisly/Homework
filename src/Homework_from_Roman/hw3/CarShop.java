package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.factory.Factory;
import Homework_from_Roman.hw3.models.Car;
import Homework_from_Roman.hw3.models.enums.*;
import Homework_from_Roman.hw3.service.Service;

import java.util.Set;

public class CarShop {

    private Service service;
    private Factory factory;

    public CarShop(Service service, Factory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        return factory.createCar(model, engineVolume, color, wheelSize, options);
    }

    public void changeColor(Car car, Color color) {
        service.changeColor(car, color);
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        service.changeWheels(car, wheelSize);
    }

    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }

    public void printFactorySettings() {
        System.out.println(factory.getConfigurations());
    }

}