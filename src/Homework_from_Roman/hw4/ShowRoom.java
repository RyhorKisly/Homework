package Homework_from_Roman.hw4;


import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.Mercedes;
import Homework_from_Roman.hw4.brand.enums.Colour;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.WheelSize;
import Homework_from_Roman.hw4.brand.enums.enumAudi.*;
import Homework_from_Roman.hw4.brand.enums.enumBMW.*;
import Homework_from_Roman.hw4.brand.enums.enumMercedes.*;
import Homework_from_Roman.hw4.factories.Factory;
import Homework_from_Roman.hw4.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4.service.*;

import java.util.Set;

public class ShowRoom {

    private Service service;
    private ServiceColor serviceColor;
    private ServiceWheels serviceWheels;
    private ServiceOption serviceOption;
    private ServiceWheelDrive serviceWheelDrive;
    private Factory factory;
    private FactoryMercedes factoryMercedes;
    private FactoryAudi factoryAudi;
    private FactoryBMW factoryBMW;

    public ShowRoom(ServiceColor serviceColor, ServiceWheels serviceWheels, ServiceOption serviceOption, ServiceWheelDrive serviceWheelDrive,
                    FactoryMercedes factoryMercedes, FactoryAudi factoryAudi, FactoryBMW factoryBMW) {
        this.serviceColor = serviceColor;
        this.serviceWheels = serviceWheels;
        this.serviceOption = serviceOption;
        this.serviceWheelDrive = serviceWheelDrive;
        this.factoryMercedes = factoryMercedes;
        this.factoryAudi = factoryAudi;
        this.factoryBMW = factoryBMW;
    }

    public ShowRoom(ServiceColor serviceColor, FactoryMercedes factoryMercedes, FactoryAudi factoryAudi, FactoryBMW factoryBMW) {
        this.serviceColor = serviceColor;
        this.factoryMercedes = factoryMercedes;
        this.factoryAudi = factoryAudi;
        this.factoryBMW = factoryBMW;
    }

    public ShowRoom(Service service, Factory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderMercedes(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        return factoryMercedes.createCar(model, engineVolume, colour, wheelSize, option, wheelDrive);
    }

    public Car orderAudi(ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi colour, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        return factoryAudi.createCar(model, engineVolume, colour, wheelSize, option, transmission);
    }

    public Car orderBMW(ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW colour, WheelSizeBMW wheelSize, Set<Option> options, FuelType fuelType) {
        return factoryBMW.createCar(model, engineVolume, colour, wheelSize, options, fuelType);
    }

    public void changeColor(Car car, Colour colour) {
        serviceColor.changeColor(car, colour);
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        serviceWheels.changeWheels(car, wheelSize);
    }

    public void changeWheelDrive(Mercedes mercedes, WheelDrive wheelDrive) {
        serviceWheelDrive.changeWheelDrive(mercedes, wheelDrive);
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