package Homework_from_Roman.hw4;

import Homework_from_Roman.hw4.cars.Audi;
import Homework_from_Roman.hw4.cars.BMW;
import Homework_from_Roman.hw4.cars.Mercedes;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.enumAudi.*;
import Homework_from_Roman.hw4.enums.enumBMW.*;
import Homework_from_Roman.hw4.enums.enumMercedes.*;
import Homework_from_Roman.hw4.factories.Storage;
import Homework_from_Roman.hw4.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4.service.ServiceColor;
import Homework_from_Roman.hw4.service.ServiceOption;
import Homework_from_Roman.hw4.service.ServiceWheels;

import java.util.HashSet;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ServiceColor serviceColor = new ServiceColor();
        ServiceWheels serviceWheels = new ServiceWheels();
        ServiceOption serviceOption = new ServiceOption();
        Storage storage = new Storage();

        FactoryBMW factoryBMW = new FactoryBMW(ColourBMW.values(), ModelBMW.values(), WheelSizeBMW.values(),
                EngineVolumeBMW.values(), DiscBrakes.values(), FuelType.values());
        FactoryAudi factoryAudi = new FactoryAudi(ColourAudi.values(), ModelAudi.values(), WheelSizeAudi.values(),
                EngineVolumeAudi.values(), Transmission.values());
        FactoryMercedes factoryMercedes = new FactoryMercedes(ColourMercedes.values(), ModelMercedes.values(),
                WheelSizeMercedes.values(), EngineVolumeMercedes.values(), WheelDrive.values());

        ShowRoom showRoom = new ShowRoom(serviceColor, serviceWheels, serviceOption, factoryMercedes, factoryAudi, factoryBMW);

        showRoom.printFactoryBMWSettings();
        showRoom.printFactoryAudiSettings();
        showRoom.printFactoryMercedesSettings();

        System.out.println();
        BMW bmw = (BMW) showRoom.orderBMW(
                ModelBMW.SERIES3,
                EngineVolumeBMW.SMALL_VOLUME,
                ColourBMW.VIOLET,
                WheelSizeBMW.SMALL,
                new HashSet<>(),
                DiscBrakes.ALL_WHEELS,
                FuelType.DIESEL);
        System.out.println();
        Audi audi = (Audi) showRoom.orderAudi(
                ModelAudi.A4,
                EngineVolumeAudi.MEDIUM_VOLUME,
                ColourAudi.RED, WheelSizeAudi.MEDIUM,
                new HashSet<>(List.of(Option.LEATHER_SEATS)),
                Transmission.AUTOMATIC);
        System.out.println();
        Mercedes mercedes = (Mercedes) showRoom.orderMercedes(
                ModelMercedes.CLASS_C,
                EngineVolumeMercedes.BIG_VOLUME,
                ColourMercedes.GREY, WheelSizeMercedes.VERY_BIG,
                new HashSet<>(),
                WheelDrive.ALL);

        showRoom.changeColor(bmw, ColourBMW.ORANGE);
        showRoom.changeWheels(audi, WheelSizeAudi.VERY_SMALL);
        showRoom.addOption(bmw, Option.WINDSHIELD_HEATING);
        showRoom.addOption(bmw, Option.LEATHER_SEATS);
        showRoom.deleteOption(bmw, Option.WINDSHIELD_HEATING);

        System.out.println("\n");
        System.out.println("Полученный автомобиль BMW: \n" + bmw.toString());
        System.out.println("Полученный автомобиль Audi: \n" + audi.toString());
        System.out.println("Полученный автомобиль Mercedes: \n" + mercedes.toString());


    }
}
