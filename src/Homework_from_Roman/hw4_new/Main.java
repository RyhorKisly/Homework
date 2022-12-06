package Homework_from_Roman.hw4_new;

import Homework_from_Roman.hw4_new.cars.Audi;
import Homework_from_Roman.hw4_new.cars.BMW;
import Homework_from_Roman.hw4_new.cars.Mercedes;
import Homework_from_Roman.hw4_new.enums.Option;
import Homework_from_Roman.hw4_new.enums.enumAudi.*;
import Homework_from_Roman.hw4_new.enums.enumBMW.*;
import Homework_from_Roman.hw4_new.enums.enumMercedes.*;
import Homework_from_Roman.hw4_new.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4_new.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4_new.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4_new.service.ServiceColor;
import Homework_from_Roman.hw4_new.service.ServiceOption;
import Homework_from_Roman.hw4_new.service.ServiceWheels;

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

        showRoom.printFactoryBMWSettings();
        showRoom.printFactoryAudiSettings();
        showRoom.printFactoryMercedesSettings();

        System.out.println();
        BMW bmw = (BMW) showRoom.orderBMW(
                ModelBMW.SERIES3,
                EngineVolumeBMW.BIG_VOLUME,
                ColourBMW.BLACK,
                WheelSizeBMW.SMALL,
                new HashSet<>(),
                FuelType.DIESEL);
        System.out.println();
        Audi audi = (Audi) showRoom.orderAudi(
                ModelAudi.A4,
                EngineVolumeAudi.MEDIUM_VOLUME,
                ColourAudi.RED, WheelSizeAudi.MEDIUM,
                new HashSet<>(Option.REAR_VIEW_CAMERA.ordinal()),
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

        System.out.println("\n");
        System.out.println("Полученный автомобиль BMW: \n" + bmw.toString());
        System.out.println("Полученный автомобиль Audi: \n" + audi.toString());
        System.out.println("Полученный автомобиль Mercedes: \n" + mercedes.toString());


    }
}
