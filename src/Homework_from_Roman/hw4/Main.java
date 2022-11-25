package Homework_from_Roman.hw4;

import Homework_from_Roman.hw4.cars.BMW;
import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.cars.Mercedes;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.SpecialOption;
import Homework_from_Roman.hw4.enums.enumAudi.*;
import Homework_from_Roman.hw4.enums.enumBMW.*;
import Homework_from_Roman.hw4.enums.enumMercedes.*;
import Homework_from_Roman.hw4.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4.service.*;

import java.util.Arrays;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        ServiceColor serviceColor = new ServiceColor();
        ServiceWheels serviceWheels = new ServiceWheels();
        ServiceOption serviceOption = new ServiceOption();

        FactoryBMW factoryBMW = new FactoryBMW(ColourBMW.values(), ModelBMW.values(), WheelSizeBMW.values(), EngineVolumeBMW.values(), FuelType.values());
        FactoryAudi factoryAudi = new FactoryAudi(ColourAudi.values(), ModelAudi.values(), WheelSizeAudi.values(), EngineVolumeAudi.values(), Transmission.values());
        FactoryMercedes factoryMercedes = new FactoryMercedes(ColourMercedes.values(), ModelMercedes.values(), WheelSizeMercedes.values(), EngineVolumeMercedes.values(), WheelDrive.values());


        ShowRoom showRoom = new ShowRoom(serviceColor, serviceWheels, serviceOption, factoryMercedes, factoryAudi, factoryBMW);


//
        showRoom.printFactoryBMWSettings();
        showRoom.printFactoryAudiSettings();
        showRoom.printFactoryMercedesSettings();

        System.out.println();
        Car bmw = showRoom.orderBMW(
                ModelBMW.SERIES3,
                EngineVolumeBMW.BIG_VOLUME,
                ColourBMW.BLACK,
                WheelSizeBMW.SMALL,
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
                ColourMercedes.GREY, WheelSizeMercedes.VERY_BIG,
                new HashSet<>(),
                WheelDrive.REAR);

        showRoom.changeColor(bmw, ColourBMW.ORANGE);
        showRoom.changeWheels(audi, WheelSizeAudi.VERY_SMALL);

        System.out.println("\n");
        System.out.println("Полученный автомобиль BMW: \n" + bmw.toString());
        System.out.println("Полученный автомобиль Audi: \n" + audi.toString());
        System.out.println("Полученный автомобиль Mercedes: \n" + mercedes.toString());


    }
}
