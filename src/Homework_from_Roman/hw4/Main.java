package Homework_from_Roman.hw4;

import Homework_from_Roman.hw4.factory.Factory;
import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.commonFields.Color;
import Homework_from_Roman.hw4.brand.enums.commonFields.EngineVolume;
import Homework_from_Roman.hw4.brand.enums.commonFields.Model;
import Homework_from_Roman.hw4.brand.enums.commonFields.WheelSize;
import Homework_from_Roman.hw4.service.Service;

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
