package Homework_from_Roman.course;

import Homework_from_Roman.course.cars.Audi;
import Homework_from_Roman.course.cars.BMW;
import Homework_from_Roman.course.cars.Mercedes;
import Homework_from_Roman.course.enums.Option;
import Homework_from_Roman.course.enums.enumAudi.*;
import Homework_from_Roman.course.enums.enumBMW.*;
import Homework_from_Roman.course.enums.enumMercedes.*;
import Homework_from_Roman.course.factories.Storage;
import Homework_from_Roman.course.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.course.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.course.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.course.service.ServiceColor;
import Homework_from_Roman.course.service.ServiceOption;
import Homework_from_Roman.course.service.ServiceWheels;

import java.util.HashSet;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ServiceColor serviceColor = new ServiceColor();
        ServiceWheels serviceWheels = new ServiceWheels();
        ServiceOption serviceOption = new ServiceOption();

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
        BMW bmw = showRoom.orderBMW(
                ModelBMW.SERIES3,
                EngineVolumeBMW.SMALL_VOLUME,
                ColourBMW.VIOLET,
                WheelSizeBMW.SMALL,
                new HashSet<>(),
                DiscBrakes.ALL_WHEELS,
                FuelType.DIESEL);
        System.out.println();
        Audi audi = showRoom.orderAudi(
                ModelAudi.A4,
                EngineVolumeAudi.MEDIUM_VOLUME,
                ColourAudi.RED, WheelSizeAudi.MEDIUM,
                new HashSet<>(List.of(Option.LEATHER_SEATS)),
                Transmission.AUTOMATIC);
        System.out.println();
        Mercedes mercedes = showRoom.orderMercedes(
                ModelMercedes.CLASS_C,
                EngineVolumeMercedes.BIG_VOLUME,
                ColourMercedes.GREY, WheelSizeMercedes.VERY_BIG,
                new HashSet<>(),
                WheelDrive.ALL);

        showRoom.changeColorBMW(bmw, ColourBMW.ORANGE);
        showRoom.changeWheelsAudi(audi, WheelSizeAudi.VERY_SMALL);
        showRoom.addOption(bmw, Option.WINDSHIELD_HEATING);
        showRoom.addOption(bmw, Option.LEATHER_SEATS);
        showRoom.deleteOption(bmw, Option.WINDSHIELD_HEATING);

        System.out.println("\n");
        System.out.println("Полученный автомобиль BMW: \n" + bmw.toString());
        System.out.println("Полученный автомобиль Audi: \n" + audi.toString());
        System.out.println("Полученный автомобиль Mercedes: \n" + mercedes.toString());


    }
}
