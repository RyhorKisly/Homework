package Homework_from_Roman.hw4.factories.factoryMercedes;

import Homework_from_Roman.hw4.cars.Mercedes;
import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.enumMercedes.ColourMercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.EngineVolumeMercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.ModelMercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.WheelDrive;
import Homework_from_Roman.hw4.enums.enumMercedes.WheelSizeMercedes;
import Homework_from_Roman.hw4.factories.Factory;
import Homework_from_Roman.hw4.factories.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryMercedes extends Factory {

    private static final int YEAR = 2022;
    private WheelDrive[] wheelDrive;
    private final Storage<WheelDrive> storage;

    public FactoryMercedes(ColourMercedes[] colour, ModelMercedes[] model, WheelSizeMercedes[] wheelSize, EngineVolumeMercedes[] engineVolume, WheelDrive[] wheelDrive) {
        super(colour, model, wheelSize, engineVolume);
        this.wheelDrive = wheelDrive;
        this.storage = new Storage<>();
        fillStorageWithCars();
    }


    public Car createCar(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        Mercedes mercedes = (Mercedes) storage.getCarFromStorage(model, engineVolume, colour, wheelSize, option, wheelDrive);
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
                Arrays.toString(wheelDrive)
        );
    }

    public void fillStorageWithCars() {
        Mercedes mercedes = new Mercedes(YEAR, ModelMercedes.CLASS_C, EngineVolumeMercedes.BIG_VOLUME,
                ColourMercedes.GREY, WheelSizeMercedes.SMALLEST, new HashSet<>(), WheelDrive.ALL);
        this.storage.addCarToStorage(mercedes);
        Set<Option> option = new HashSet<>();
        option.add(Option.LEATHER_SEATS);
        mercedes = new Mercedes(YEAR, ModelMercedes.CLASS_E, EngineVolumeMercedes.MEDIUM_VOLUME,
                ColourMercedes.WHITE, WheelSizeMercedes.VERY_BIG, new HashSet<>(), WheelDrive.REAR);
        this.storage.addCarToStorage(mercedes);
    }


}
