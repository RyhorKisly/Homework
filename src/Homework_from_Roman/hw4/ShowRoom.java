package Homework_from_Roman.hw4;

import Homework_from_Roman.hw4.brand.enums.commonFields.*;
import Homework_from_Roman.hw4.brand.enums.commonFields.engineVolumes.EngineVolume;
import Homework_from_Roman.hw4.factory.Factory;
import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.service.Service;

import java.util.Set;

public class ShowRoom {

    private Service service;
    private Factory factory;

    public ShowRoom(Service service, Factory factory) {
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