package Homework_from_Roman.hw4.factories.factoryMercedes;

import Homework_from_Roman.hw4.cars.Mercedes;
import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.*;
import Homework_from_Roman.hw4.enums.enumBMW.*;
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
    protected Car createCar(Model model, EngineVolume engineVolume, Colour colour, WheelSize wheelSize,
                         Set<Option> option, SpecialOption wheelDrive) {
        Mercedes mercedes = (Mercedes) storage.getCarFromStorage(model, engineVolume, colour, wheelSize,
                option, (WheelDrive) wheelDrive);
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
        return new Mercedes(YEAR, (ModelMercedes) model, (EngineVolumeMercedes) engineVolume, (ColourMercedes) colour,
                (WheelSizeMercedes) wheelSize, option, (WheelDrive) wheelDrive);
    }

    public Car createMercedes(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize,
                              Set<Option> option, WheelDrive wheelDrive) {
        return createCar(model, engineVolume, colour, wheelSize,
                option, wheelDrive);
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
                ColourMercedes.WHITE, WheelSizeMercedes.VERY_BIG, new HashSet<>(), WheelDrive.REAR);
        this.storage.addCarToStorage(mercedes);
    }


}
