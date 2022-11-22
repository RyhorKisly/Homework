package Homework_from_Roman.hw4Two.factories.factoryBMW;

import Homework_from_Roman.hw4Two.brand.BMW;
import Homework_from_Roman.hw4Two.brand.Car;
import Homework_from_Roman.hw4Two.brand.enums.Option;
import Homework_from_Roman.hw4Two.brand.enums.enumBMW.*;
import Homework_from_Roman.hw4Two.factories.Factory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryBMW<T, C, M, W, E> implements Factory<T, C, M, W, E> {

    private static final int YEAR = 2022;
    private final ColourBMW[] colour;
    private final ModelBMW[] model;
    private final WheelSizeBMW[] wheelSize;
    private final EngineVolumeBMW[] engineVolume;
    private final FuelType[] fuelTypes;
    private final StorageBMW storageBMW;

    public FactoryBMW(ColourBMW[] colour, ModelBMW[] model, WheelSizeBMW[] wheelSize, EngineVolumeBMW[] engineVolume, FuelType[] fuelTypes) {
        this.colour = colour;
        this.model = model;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.fuelTypes = fuelTypes;
        this.storageBMW = new StorageBMW();
        fillStorageWithCars();
    }


    public Car createCar(M model, E engineVolume, C colour, W wheelSize, Set<Option> option, T fuelType) {
        BMW bmw = storageBMW.getCarFromStorage(model, engineVolume, colour, wheelSize, option, fuelType);
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
        this.storageBMW.addCarToStorage(bmw);
        Set<Option> option = new HashSet<>();
        option.add(Option.REAR_VIEW_CAMERA);
        bmw = new BMW(YEAR, ModelBMW.SERIES5, EngineVolumeBMW.MEDIUM_VOLUME, ColourBMW.ORANGE, WheelSizeBMW.MEDIUM, new HashSet<>(), FuelType.PETROL);
        this.storageBMW.addCarToStorage(bmw);
    }


}
