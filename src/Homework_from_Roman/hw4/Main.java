package Homework_from_Roman.hw4;

import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.enumAudi.*;
import Homework_from_Roman.hw4.brand.enums.enumBMW.*;
import Homework_from_Roman.hw4.brand.enums.enumMercedes.*;
import Homework_from_Roman.hw4.factories.Factory;
import Homework_from_Roman.hw4.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4.service.*;

import java.util.HashSet;


public class Main {

    private static Factory factory;
    private static Service service;

    public static void main(String[] args) {


        Service serviceColor = new ServiceColor();
        Service serviceWheels = new ServiceWheels();
        Service serviceOption = new ServiceOption();
        Service serviceWheelDrive = new ServiceWheelDrive();

        Factory factoryBMW = new FactoryBMW(ColourBMW.values(), ModelBMW.values(), WheelSizeBMW.values(), EngineVolumeBMW.values(), FuelType.values());
        Factory factoryAudi = new FactoryAudi(ColourAudi.values(), ModelAudi.values(), WheelSizeAudi.values(), EngineVolumeAudi.values(), Transmission.values());
        Factory factoryMercedes = new FactoryMercedes(ColourMercedes.values(), ModelMercedes.values(), WheelSizeMercedes.values(), EngineVolumeMercedes.values(), WheelDrive.values());




        ShowRoom showRoom = new ShowRoom(service, factory);
//
        showRoom.printFactoryBMWSettings();
        showRoom.printFactoryAudiSettings();
        showRoom.printFactoryMercedesSettings();

        Car bmw = showRoom.orderBMW(
                ModelBMW.SERIES3,
                EngineVolumeBMW.BIG_VOLUME,
                ColourBMW.BLACK,
                WheelSizeBMW.BIG,
                new HashSet<>(),
                FuelType.DIESEL);
        Car audi = showRoom.orderAudi(
                ModelAudi.A4,
                EngineVolumeAudi.MEDIUM_VOLUME,
                ColourAudi.RED, WheelSizeAudi.MEDIUM,
                new HashSet<>(Option.REAR_VIEW_CAMERA.ordinal()),
                Transmission.AUTOMATIC);
        Car mercedes = showRoom.orderMercedes(
                ModelMercedes.CLASS_C,
                EngineVolumeMercedes.BIG_VOLUME,
                ColourMercedes.GREY, WheelSizeMercedes.MEDIUM,
                new HashSet<>(),
                WheelDrive.REAR);





//        System.out.println("Полученный автомобиль: \n" + car.toString());

    }
}
