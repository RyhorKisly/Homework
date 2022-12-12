package Homework_from_Roman.course.factories.factoryBMW;

import Homework_from_Roman.course.cars.BMW;
import Homework_from_Roman.course.cars.Car;
import Homework_from_Roman.course.enums.Option;
import Homework_from_Roman.course.enums.enumBMW.*;
import Homework_from_Roman.course.factories.Factory;
import Homework_from_Roman.course.factories.Storage;
import Homework_from_Roman.course.cars.specialOptions.SpecialOptionsBMW;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.String.format;

public class FactoryBMW<M extends ModelBMW, E extends EngineVolumeBMW, C extends ColourBMW,
        W extends WheelSizeBMW, S extends SpecialOptionsBMW> extends Factory<M, E, C, W, S> {

    private static final int YEAR = 2022;
    private final DiscBrakes[] discBrakes;
    private final FuelType[] fuelTypes;
    private final Storage storage;


    public FactoryBMW(ColourBMW[] colour, ModelBMW[] model, WheelSizeBMW[] wheelSize,
                      EngineVolumeBMW[] engineVolume, DiscBrakes[] discBrakes, FuelType[] fuelTypes) {
        super(colour, model, wheelSize, engineVolume);
        this.fuelTypes = fuelTypes;
        this.discBrakes = discBrakes;
        this.storage = new Storage();
        fillStorageWithCars();
    }

    @Override
    public Car createCar(M model, E engineVolume, C colour, W wheelSize, Set<Option> option, S specialOptionsBMW) {
        BMW bmw = (BMW) storage.getCarFromStorage(model, engineVolume, colour, wheelSize, option);
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
            if (bmw.getDiscBrakes() != specialOptionsBMW.getDiscBrakes()) {
                bmw.setDiscBrakes(specialOptionsBMW.getDiscBrakes());
            }
            if (bmw.getFuelType() != specialOptionsBMW.getFuelType()) {
                bmw.setFuelType(specialOptionsBMW.getFuelType());
            }
            System.out.println("Автомобиль BMW взяли со склада");
            return bmw;
        }
        return new BMW(
                YEAR, model, engineVolume, colour, wheelSize, option,
                specialOptionsBMW.getDiscBrakes(), specialOptionsBMW.getFuelType());
    }

    public String getConfigurations() {
        return format(
                "FactoryBMW can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s, fuelTypes: %s",
                Arrays.toString(ColourBMW.values()),
                Arrays.toString(ModelBMW.values()),
                Arrays.toString(WheelSizeBMW.values()),
                Arrays.toString(EngineVolumeBMW.values()),
                Arrays.toString(discBrakes),
                Arrays.toString(fuelTypes)
        );
    }

    public void fillStorageWithCars() {
        BMW bmw = new BMW(YEAR, ModelBMW.SERIES3, EngineVolumeBMW.SMALL_VOLUME, ColourBMW.VIOLET,
                WheelSizeBMW.SMALL, new HashSet<>(List.of(Option.REAR_VIEW_CAMERA)), DiscBrakes.FRONT, FuelType.DIESEL);
        this.storage.addCarToStorage(bmw);
        Set<Option> option = new HashSet<>();
        option.add(Option.REAR_VIEW_CAMERA);
        bmw = new BMW(YEAR, ModelBMW.SERIES3, EngineVolumeBMW.SMALL_VOLUME, ColourBMW.BLACK,
                WheelSizeBMW.BIG, option, DiscBrakes.ALL_WHEELS, FuelType.PETROL);
        this.storage.addCarToStorage(bmw);
    }


}
