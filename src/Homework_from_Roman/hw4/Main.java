package Homework_from_Roman.hw4;

import Homework_from_Roman.hw4.brand.BMW;
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


        ServiceColor serviceColor = new ServiceColor();
        ServiceWheels serviceWheels = new ServiceWheels();
        ServiceOption serviceOption = new ServiceOption();
        ServiceWheelDrive serviceWheelDrive = new ServiceWheelDrive();

        FactoryBMW factoryBMW = new FactoryBMW(ColourBMW.values(), ModelBMW.values(), WheelSizeBMW.values(), EngineVolumeBMW.values(), FuelType.values());
        FactoryAudi factoryAudi = new FactoryAudi(ColourAudi.values(), ModelAudi.values(), WheelSizeAudi.values(), EngineVolumeAudi.values(), Transmission.values());
        FactoryMercedes factoryMercedes = new FactoryMercedes(ColourMercedes.values(), ModelMercedes.values(), WheelSizeMercedes.values(), EngineVolumeMercedes.values(), WheelDrive.values());


//        ShowRoom showRoom2 = new ShowRoom(service, factory);
//        showRoom2.printFactoryBMWSettings();





        ShowRoom showRoom = new ShowRoom(serviceColor, serviceWheels, serviceOption, serviceWheelDrive, factoryMercedes, factoryAudi, factoryBMW);

        showRoom.printFactoryBMWSettings();
        showRoom.printFactoryAudiSettings();
        showRoom.printFactoryMercedesSettings();

        System.out.println();
        Car bmw = showRoom.orderBMW(
                ModelBMW.SERIES3,
                EngineVolumeBMW.BIG_VOLUME,
                ColourBMW.BLACK,
                WheelSizeBMW.BIG,
                new HashSet<>(),
                FuelType.DIESEL);
        System.out.println();
        Car audi = showRoom.orderAudi(
                ModelAudi.A4,
                EngineVolumeAudi.MEDIUM_VOLUME,
                ColourAudi.RED, WheelSizeAudi.MEDIUM,
                new HashSet<>(Option.REAR_VIEW_CAMERA.ordinal()),
                Transmission.AUTOMATIC);
        System.out.println();
        Car mercedes = showRoom.orderMercedes(
                ModelMercedes.CLASS_C,
                EngineVolumeMercedes.BIG_VOLUME,
                ColourMercedes.GREY, WheelSizeMercedes.MEDIUM,
                new HashSet<>(),
                WheelDrive.REAR);

        showRoom.changeWheels(bmw, WheelSizeBMW.SMALL);


        System.out.println("\n");
        System.out.println("Полученный автомобиль BMW: \n" + bmw.toString());
        System.out.println();
        System.out.println("Полученный автомобиль Audi: \n" + audi.toString());
        System.out.println();
        System.out.println("Полученный автомобиль Mercedes: \n" + mercedes.toString());



    }
}
