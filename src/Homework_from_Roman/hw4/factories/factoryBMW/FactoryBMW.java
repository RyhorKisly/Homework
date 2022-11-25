package Homework_from_Roman.hw4.factories.factoryBMW;

import Homework_from_Roman.hw4.cars.BMW;
import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.*;
import Homework_from_Roman.hw4.enums.enumBMW.*;
import Homework_from_Roman.hw4.factories.Factory;
import Homework_from_Roman.hw4.factories.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryBMW extends Factory {

    ModelBMW modelBMW;

    private static final int YEAR = 2022;
    private final FuelType[] fuelTypes;
    private final Storage<FuelType> storage;

    public FactoryBMW(ColourBMW[] colour, ModelBMW[] model, WheelSizeBMW[] wheelSize,
                      EngineVolumeBMW[] engineVolume, FuelType[] fuelTypes) {
        super(colour, model, wheelSize, engineVolume);
        this.fuelTypes = fuelTypes;
        this.storage = new Storage<>();
        fillStorageWithCars();
    }

    public Car createBMW(ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW colour, WheelSizeBMW wheelSize,
                          Set<Option> option, FuelType fuelType) {
        return createCar(model, engineVolume, colour, wheelSize,
                option, fuelType);
    }
    @Override
    protected Car createCar(Model model, EngineVolume engineVolume, Colour colour, WheelSize wheelSize,
                         Set<Option> option, SpecialOption fuelType) {
        BMW bmw = (BMW) storage.getCarFromStorage(model, engineVolume, colour, wheelSize, option, (FuelType) fuelType);
        if (bmw != null) {
            if (bmw.getColor() != colour) {
                bmw.setColor(colour);
            }
            if (bmw.getWheelSize() != wheelSize) {
                bmw.setWheelSize(wheelSize);
            }
            if (!bmw.getOption().equals(option)) {
                bmw.setOption(option);
            }
            System.out.println("Автомобиль BMW взяли со склада");
            return bmw;
        }
        modelBMW = (ModelBMW) model;
        return new BMW(YEAR, modelBMW, (EngineVolumeBMW) engineVolume, (ColourBMW) colour,
                (WheelSizeBMW) wheelSize, option, (FuelType) fuelType);
    }

    public String getConfigurations() {
        return format(
                "FactoryBMW can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s, fuelTypes: %s",
                Arrays.toString(ColourBMW.values()),
                Arrays.toString(ModelBMW.values()),
                Arrays.toString(WheelSizeBMW.values()),
                Arrays.toString(EngineVolumeBMW.values()),
                Arrays.toString(fuelTypes)
        );
    }

    public void fillStorageWithCars() {
        BMW bmw = new BMW(YEAR, ModelBMW.SERIES3, EngineVolumeBMW.BIG_VOLUME, ColourBMW.BLACK,
                WheelSizeBMW.SMALL, new HashSet<>(), FuelType.DIESEL);
        this.storage.addCarToStorage(bmw);
        Set<Option> option = new HashSet<>();
        option.add(Option.REAR_VIEW_CAMERA);
        bmw = new BMW(YEAR, ModelBMW.SERIES5, EngineVolumeBMW.MEDIUM_VOLUME, ColourBMW.BLACK,
                WheelSizeBMW.BIG, new HashSet<>(), FuelType.PETROL);
        this.storage.addCarToStorage(bmw);
    }


}
