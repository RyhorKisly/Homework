package Homework_from_Roman.hw4.factories.factoryBMW;

import Homework_from_Roman.hw4.cars.BMW;
import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.enumBMW.*;
import Homework_from_Roman.hw4.factories.Factory;
import Homework_from_Roman.hw4.factories.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryBMW extends Factory {

    private static final int YEAR = 2022;
    private final ColourBMW[] colour;
    private final ModelBMW[] model;
    private final WheelSizeBMW[] wheelSize;
    private final EngineVolumeBMW[] engineVolume;
    private final FuelType[] fuelTypes;
    private final Storage<FuelType> storage;
    Car car;

    public FactoryBMW(ColourBMW[] colour, ModelBMW[] model, WheelSizeBMW[] wheelSize, EngineVolumeBMW[] engineVolume, FuelType[] fuelTypes) {
        super(colour, model, wheelSize, engineVolume);
        this.colour = colour;
        this.model = model;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.fuelTypes = fuelTypes;
        this.storage = new Storage<>();
        fillStorageWithCars();
    }

    public Car createCar(ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW colour, WheelSizeBMW wheelSize, Set<Option> option, FuelType fuelType) {
        BMW bmw = (BMW) storage.getCarFromStorage(model, engineVolume, colour, wheelSize, option, fuelType);
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
        return new BMW(YEAR, model, engineVolume, colour, wheelSize, option, fuelType);
    }


    public String getConfigurations() {
        return format(
                "FactoryBMW can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(colour),
                Arrays.toString(model),
                Arrays.toString(wheelSize),
                Arrays.toString(engineVolume),
                Arrays.toString(fuelTypes)
        );
    }

    public void fillStorageWithCars() {
        // Any custom logic about creating initial cars.
        BMW bmw = new BMW(YEAR, ModelBMW.SERIES3, EngineVolumeBMW.BIG_VOLUME, ColourBMW.BLACK, WheelSizeBMW.SMALL, new HashSet<>(), FuelType.DIESEL);
        this.storage.addCarToStorage(bmw);
        Set<Option> option = new HashSet<>();
        option.add(Option.REAR_VIEW_CAMERA);
        bmw = new BMW(YEAR, ModelBMW.SERIES5, EngineVolumeBMW.MEDIUM_VOLUME, ColourBMW.BLACK, WheelSizeBMW.BIG, new HashSet<>(), FuelType.PETROL);
        this.storage.addCarToStorage(bmw);
    }


}
