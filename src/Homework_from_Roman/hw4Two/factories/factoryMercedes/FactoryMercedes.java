package Homework_from_Roman.hw4Two.factories.factoryMercedes;

import Homework_from_Roman.hw4Two.brand.Car;
import Homework_from_Roman.hw4Two.brand.Mercedes;
import Homework_from_Roman.hw4Two.brand.enums.Option;
import Homework_from_Roman.hw4Two.brand.enums.enumMercedes.*;
import Homework_from_Roman.hw4Two.factories.Factory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryMercedes implements Factory {

    private static final int YEAR = 2022;
    private final ColourMercedes[] colour;
    private final ModelMercedes[] model;
    private final WheelSizeMercedes[] wheelSize;
    private final EngineVolumeMercedes[] engineVolume;
    private WheelDrive[] wheelDrive;
    private final StorageMercedes storageMercedes;

    public FactoryMercedes(ColourMercedes[] colour, ModelMercedes[] model, WheelSizeMercedes[] wheelSize, EngineVolumeMercedes[] engineVolume, WheelDrive[] wheelDrive) {
        this.colour = colour;
        this.model = model;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.wheelDrive = wheelDrive;
        this.storageMercedes = new StorageMercedes();
        fillStorageWithCars();
    }


    public Car createCar(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        Mercedes mercedes = storageMercedes.getCarFromStorage(model, engineVolume, colour, wheelSize, option, wheelDrive);
        if (mercedes != null) {
            if (mercedes.getColor() != colour) {
                mercedes.setColor(colour);
            }
            if (mercedes.getWheelSize() != wheelSize) {
                mercedes.setWheelSize(wheelSize);
            }
            if (!mercedes.getOption().equals(option)) {
                mercedes.setOption(option);
            }
            if (!mercedes.getWheelDrive().equals(wheelDrive)) {
                mercedes.setWheelDrive(wheelDrive);
            }
            System.out.println("Автомобиль Mercedes взяли со склада");
            return mercedes;
        }
        return new Mercedes(YEAR, model, engineVolume, colour, wheelSize, option, wheelDrive);
    }


    public String getConfigurations() {
        return format(
                "FactoryMercedes can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(colour),
                Arrays.toString(model),
                Arrays.toString(wheelSize),
                Arrays.toString(engineVolume),
                Arrays.toString(wheelDrive)
        );
    }

    public void fillStorageWithCars() {
        // Any custom logic about creating initial cars.
        Mercedes mercedes = new Mercedes(YEAR, ModelMercedes.CLASS_C, EngineVolumeMercedes.BIG_VOLUME, ColourMercedes.GREY, WheelSizeMercedes.SMALL, new HashSet<>(), WheelDrive.ALL);
        this.storageMercedes.addCarToStorage(mercedes);
        Set<Option> option = new HashSet<>();
        option.add(Option.LEATHER_SEATS);
        mercedes = new Mercedes(YEAR, ModelMercedes.CLASS_E, EngineVolumeMercedes.MEDIUM_VOLUME, ColourMercedes.WHITE, WheelSizeMercedes.MEDIUM, new HashSet<>(), WheelDrive.REAR);
        this.storageMercedes.addCarToStorage(mercedes);
    }


}
