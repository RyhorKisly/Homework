package Homework_from_Roman.hw4_new.factories.factoryMercedes;

import Homework_from_Roman.hw4_new.cars.Car;
import Homework_from_Roman.hw4_new.cars.Mercedes;
import Homework_from_Roman.hw4_new.enums.Option;
import Homework_from_Roman.hw4_new.enums.enumMercedes.*;
import Homework_from_Roman.hw4_new.factories.Factory;
import Homework_from_Roman.hw4_new.factories.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryMercedes<M extends ModelMercedes, E extends EngineVolumeMercedes, C extends ColourMercedes,
        W extends WheelSizeMercedes, S extends WheelDrive> extends Factory<M, E, C, W, S> {

    private static final int YEAR = 2022;
    private WheelDrive[] wheelDrives;
    private final Storage<WheelDrive> storage;

    public FactoryMercedes(ColourMercedes[] colour, ModelMercedes[] model, WheelSizeMercedes[] wheelSize,
                           EngineVolumeMercedes[] engineVolume, WheelDrive[] wheelDrives) {
        super(colour, model, wheelSize, engineVolume);
        this.wheelDrives = wheelDrives;
        this.storage = new Storage<>();
        fillStorageWithCars();
    }

    @Override
    public Car createCar(M model, E engineVolume, C colour, W wheelSize, Set<Option> option, S wheelDrive) {
        Mercedes mercedes = (Mercedes) storage.getCarFromStorage(model, engineVolume, colour, wheelSize,
                option);
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
            System.out.println("Автомобиль Mercedes взяли со склада");
            return mercedes;
        }
        return new Mercedes(YEAR, model, engineVolume, colour, wheelSize, option, wheelDrive);
    }

    public String getConfigurations() {
        return format(
                "FactoryMercedes can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s, wheelDrive: %s",
                Arrays.toString(ColourMercedes.values()),
                Arrays.toString(ModelMercedes.values()),
                Arrays.toString(WheelSizeMercedes.values()),
                Arrays.toString(EngineVolumeMercedes.values()),
                Arrays.toString(wheelDrives)
        );
    }

    public void fillStorageWithCars() {
        Mercedes mercedes = new Mercedes(YEAR, ModelMercedes.CLASS_C, EngineVolumeMercedes.BIG_VOLUME,
                ColourMercedes.GREY, WheelSizeMercedes.SMALLEST, new HashSet<>(), WheelDrive.ALL);
        this.storage.addCarToStorage(mercedes);
        Set<Option> option = new HashSet<>();
        option.add(Option.LEATHER_SEATS);
        mercedes = new Mercedes(YEAR, ModelMercedes.CLASS_E, EngineVolumeMercedes.MEDIUM_VOLUME,
                ColourMercedes.WHITE, WheelSizeMercedes.VERY_BIG, option, WheelDrive.REAR);
        this.storage.addCarToStorage(mercedes);
    }


}
