package Homework_from_Roman.hw4;

import Homework_from_Roman.hw4.brand.BMW;
import Homework_from_Roman.hw4.brand.enums.colours.ColourBMW;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolumeBMW;
import Homework_from_Roman.hw4.brand.enums.models.ModelBMW;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.FuelType;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSizeBMW;
import Homework_from_Roman.hw4.factory.Factory;
import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolume;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSize;
import Homework_from_Roman.hw4.service.Service;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {


        Car bmw = new BMW(2022, ModelBMW.SERIES3, EngineVolumeBMW.BIG_VOLUME, ColourBMW.BLACK, WheelSizeBMW.BIG, new HashSet<>(), FuelType.DIESEL);

//        Service service = new Service();
//        Factory factory = new Factory(Color.values(), Model.values(), WheelSize.values(), EngineVolume.values());
//        ShowRoom showroom = new ShowRoom(service, factory);
//
//        showroom.printFactorySettings();
//
//        Car car = showroom.orderCar(
//                Model.AUDI,
//                EngineVolume.MEDIUM_VOLUME,
//                Color.RED,
//                WheelSize.SMALL,
//                new HashSet<>()
//        );
//        System.out.println("Полученный автомобиль: \n" + car.toString());

    }
}
