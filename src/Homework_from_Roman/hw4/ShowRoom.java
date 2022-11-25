package Homework_from_Roman.hw4;


import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.Colour;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.WheelSize;
import Homework_from_Roman.hw4.enums.enumAudi.*;
import Homework_from_Roman.hw4.enums.enumBMW.*;
import Homework_from_Roman.hw4.enums.enumMercedes.*;
import Homework_from_Roman.hw4.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4.service.*;

import java.util.Set;

public class ShowRoom {

    private final ServiceColor serviceColor;
    private final ServiceWheels serviceWheels;
    private final ServiceOption serviceOption;
    private final FactoryMercedes factoryMercedes;
    private final FactoryAudi factoryAudi;
    private final FactoryBMW factoryBMW;

    public ShowRoom(ServiceColor serviceColor, ServiceWheels serviceWheels, ServiceOption serviceOption, FactoryMercedes factoryMercedes, FactoryAudi factoryAudi, FactoryBMW factoryBMW) {
        this.serviceColor = serviceColor;
        this.serviceWheels = serviceWheels;
        this.serviceOption = serviceOption;
        this.factoryMercedes = factoryMercedes;
        this.factoryAudi = factoryAudi;
        this.factoryBMW = factoryBMW;
    }

    public Car orderMercedes(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        return factoryMercedes.createMercedes(model, engineVolume, colour, wheelSize, option, wheelDrive);
    }

    public Car orderAudi(ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi colour, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        return factoryAudi.createAudi(model, engineVolume, colour, wheelSize, option, transmission);
    }

    public Car orderBMW(ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW colour, WheelSizeBMW wheelSize, Set<Option> options, FuelType fuelType) {
        return factoryBMW.createBMW(model, engineVolume, colour, wheelSize, options, fuelType);
    }

    public void changeColor(Car car, Colour colour) {
        serviceColor.changeColor(car, colour);
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        serviceWheels.changeWheels(car, wheelSize);
    }


    public void addOption(Car car, Option option) {
        serviceOption.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        serviceOption.deleteOption(car, option);
    }

    public void printFactoryBMWSettings() {
        System.out.println(factoryBMW.getConfigurations());
    }

    public void printFactoryAudiSettings() {
        System.out.println(factoryAudi.getConfigurations());
    }

    public void printFactoryMercedesSettings() {
        System.out.println(factoryMercedes.getConfigurations());
    }

}