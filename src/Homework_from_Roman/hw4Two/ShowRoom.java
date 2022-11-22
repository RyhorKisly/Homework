package Homework_from_Roman.hw4Two;


import Homework_from_Roman.hw4Two.brand.Car;
import Homework_from_Roman.hw4Two.brand.enums.Colour;
import Homework_from_Roman.hw4Two.brand.enums.Option;
import Homework_from_Roman.hw4Two.brand.enums.WheelSize;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.ColourAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.EngineVolumeAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.ModelAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumAudi.WheelSizeAudi;
import Homework_from_Roman.hw4Two.brand.enums.enumBMW.*;
import Homework_from_Roman.hw4Two.brand.enums.enumMercedes.*;
import Homework_from_Roman.hw4Two.factories.Factory;
import Homework_from_Roman.hw4Two.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4Two.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4Two.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4Two.service.Service;
import Homework_from_Roman.hw4Two.service.ServiceColor;

import java.util.Set;

public class ShowRoom {

    private Service service;
    private ServiceColor serviceColor;
    private Factory factory;
    private FactoryMercedes factoryMercedes;
    private FactoryAudi factoryAudi;
    private FactoryBMW factoryBMW;


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
        service.changeWheels(car, wheelSize);
    }

    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }

    public void printFactoryBMWSettings() {
        factoryBMW.getConfigurations();
    }

    public void printFactoryAudiSettings() {
        System.out.println(factoryAudi.getConfigurations());
    }

    public void printFactoryMercedesSettings() {
        System.out.println(factoryMercedes.getConfigurations());
    }

}