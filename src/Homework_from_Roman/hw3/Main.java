package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.factory.Factory;
import Homework_from_Roman.hw3.models.Car;
import Homework_from_Roman.hw3.models.enums.*;
import Homework_from_Roman.hw3.service.Service;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        Factory factory = new Factory(Color.values(), Model.values(), WheelSize.values(), EngineVolume.values());
        ShowRoom showroom = new ShowRoom(service, factory);

        showroom.printFactorySettings();

        Car car = showroom.orderCar(
                Model.AUDI,
                EngineVolume.MEDIUM_VOLUME,
                Color.RED,
                WheelSize.SMALL,
                new HashSet<>()
        );
        System.out.println("Полученный автомобиль: \n" + car.toString());

    }
}
