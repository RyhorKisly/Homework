package Homework_from_Roman.course;


import Homework_from_Roman.course.cars.Audi;
import Homework_from_Roman.course.cars.BMW;
import Homework_from_Roman.course.cars.Car;
import Homework_from_Roman.course.cars.Mercedes;
import Homework_from_Roman.course.enums.Colour;
import Homework_from_Roman.course.enums.Option;
import Homework_from_Roman.course.enums.WheelSize;
import Homework_from_Roman.course.enums.enumAudi.*;
import Homework_from_Roman.course.enums.enumBMW.*;
import Homework_from_Roman.course.enums.enumMercedes.*;
import Homework_from_Roman.course.factories.factoryAudi.FactoryAudi;
import Homework_from_Roman.course.factories.factoryBMW.FactoryBMW;
import Homework_from_Roman.course.factories.factoryMercedes.FactoryMercedes;
import Homework_from_Roman.course.service.ServiceColor;
import Homework_from_Roman.course.service.ServiceOption;
import Homework_from_Roman.course.service.ServiceWheels;
import Homework_from_Roman.course.cars.specialOptions.SpecialOptionsAudi;
import Homework_from_Roman.course.cars.specialOptions.SpecialOptionsBMW;
import Homework_from_Roman.course.cars.specialOptions.SpecialOptionsMercedes;

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

    public Mercedes orderMercedes(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        return (Mercedes) factoryMercedes.createCar(model, engineVolume, colour, wheelSize, option, new SpecialOptionsMercedes(wheelDrive));
    }

    public Audi orderAudi(ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi colour, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        return (Audi) factoryAudi.createCar(model, engineVolume, colour, wheelSize, option, new SpecialOptionsAudi(transmission));
    }

    public BMW orderBMW(ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW colour, WheelSizeBMW wheelSize, Set<Option> options, DiscBrakes discBrakes, FuelType fuelType) {
        return (BMW) factoryBMW.createCar(model, engineVolume, colour, wheelSize, options, new SpecialOptionsBMW(discBrakes, fuelType));
    }

    public void changeColorBMW(BMW bmw, ColourBMW colourBMW) {
        serviceColor.changeColor(bmw, colourBMW);
    }
    public void changeColorAudi(Audi audi, ColourAudi colourAudi) {
        serviceColor.changeColor(audi, colourAudi);
    }
    public void changeColorMercedes(Mercedes mercedes, ColourMercedes colourMercedes) {
        serviceColor.changeColor(mercedes, colourMercedes);
    }

    public void changeWheelsBMW(BMW bmw, WheelSizeBMW wheelSizeBMW) {
        serviceWheels.changeWheels(bmw, wheelSizeBMW);
    }
    public void changeWheelsAudi(Audi audi, WheelSizeAudi wheelSizeAudi) {
        serviceWheels.changeWheels(audi, wheelSizeAudi);
    }
    public void changeWheelsMercedes(Mercedes mercedes, WheelSizeMercedes wheelSizeMercedes) {
        serviceWheels.changeWheels(mercedes, wheelSizeMercedes);
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