package Homework_from_Roman.hw4_new;


import Homework_from_Roman.hw4_new.cars.Car;
import Homework_from_Roman.hw4_new.enums.Colour;
import Homework_from_Roman.hw4_new.enums.Option;
import Homework_from_Roman.hw4_new.enums.WheelSize;
import Homework_from_Roman.hw4_new.enums.enumAudi.*;
import Homework_from_Roman.hw4_new.enums.enumBMW.*;
import Homework_from_Roman.hw4_new.enums.enumMercedes.*;
import Homework_from_Roman.hw4_new.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.hw4_new.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.hw4_new.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.hw4_new.service.ServiceColor;
import Homework_from_Roman.hw4_new.service.ServiceOption;
import Homework_from_Roman.hw4_new.service.ServiceWheels;
import Homework_from_Roman.hw4_new.specialOptions.SpecialOptionsBMW;

import java.util.Set;

public class ShowRoom {

    private final ServiceColor serviceColor;
    private final ServiceWheels serviceWheels;
    private final ServiceOption serviceOption;
    private final FactoryMercedes factoryMercedes;
    private final FactoryAudi factoryAudi;
    private final FactoryBMW factoryBMW;
    SpecialOptionsBMW bmwSpecialOptions;

    public ShowRoom(ServiceColor serviceColor, ServiceWheels serviceWheels, ServiceOption serviceOption, FactoryMercedes factoryMercedes, FactoryAudi factoryAudi, FactoryBMW factoryBMW) {
        this.serviceColor = serviceColor;
        this.serviceWheels = serviceWheels;
        this.serviceOption = serviceOption;
        this.factoryMercedes = factoryMercedes;
        this.factoryAudi = factoryAudi;
        this.factoryBMW = factoryBMW;

    }

    public Car orderMercedes(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        return factoryMercedes.createCar(model, engineVolume, colour, wheelSize, option, wheelDrive);
    }

    public Car orderAudi(ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi colour, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        return factoryAudi.createCar(model, engineVolume, colour, wheelSize, option, transmission);
    }

    public Car orderBMW(ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW colour, WheelSizeBMW wheelSize, Set<Option> options, DiscBrakes discBrakes, FuelType fuelType) {
        return factoryBMW.createCar(model, engineVolume, colour, wheelSize, options, new SpecialOptionsBMW(discBrakes, fuelType));
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