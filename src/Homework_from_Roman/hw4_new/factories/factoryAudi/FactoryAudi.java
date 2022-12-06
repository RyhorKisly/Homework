package Homework_from_Roman.hw4_new.factories.factoryAudi;

import Homework_from_Roman.hw4_new.cars.Audi;
import Homework_from_Roman.hw4_new.cars.Car;
import Homework_from_Roman.hw4_new.enums.Option;
import Homework_from_Roman.hw4_new.enums.enumAudi.*;
import Homework_from_Roman.hw4_new.factories.Factory;
import Homework_from_Roman.hw4_new.factories.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryAudi<M extends ModelAudi, E extends EngineVolumeAudi, C extends ColourAudi,
        W extends WheelSizeAudi, S extends Transmission> extends Factory<M, E, C, W, S> {

    private static final int YEAR = 2022;

    private final Transmission[] transmission;
    private final Storage<Transmission> storage;

    public FactoryAudi(ColourAudi[] colour, ModelAudi[] model, WheelSizeAudi[] wheelSize,
                       EngineVolumeAudi[] engineVolume, Transmission[] transmission) {
        super(colour, model, wheelSize, engineVolume);
        this.transmission = transmission;
        this.storage = new Storage<>();
        fillStorageWithCars();
    }

    @Override
    public Car createCar(M model, E engineVolume, C colour, W wheelSize, Set<Option> option, S transmission) {
        Audi audi = (Audi) storage.getCarFromStorage(model, engineVolume, colour, wheelSize,
                option);
        if (audi != null) {
            if (audi.getColor() != colour) {
                audi.setColor(colour);
            }
            if (audi.getWheelSize() != wheelSize) {
                audi.setWheelSize(wheelSize);
            }
            if (!audi.getOption().equals(option)) {
                audi.setOption(option);
            }
            System.out.println("Автомобиль Audi взяли со склада");
            return audi;
        }
        return new Audi(YEAR, model, engineVolume, colour, wheelSize, option, transmission);
    }

    public String getConfigurations() {
        return format(
                "FactoryAudi can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s, transmission: %s",
                Arrays.toString(ColourAudi.values()),
                Arrays.toString(ModelAudi.values()),
                Arrays.toString(WheelSizeAudi.values()),
                Arrays.toString(EngineVolumeAudi.values()),
                Arrays.toString(transmission)
        );
    }

    public void fillStorageWithCars() {
        Audi audi = new Audi(YEAR, ModelAudi.A4, EngineVolumeAudi.BIG_VOLUME, ColourAudi.RED,
                WheelSizeAudi.VERY_SMALL, new HashSet<>(), Transmission.AUTOMATIC);
        this.storage.addCarToStorage(audi);
        Set<Option> option = new HashSet<>();
        option.add(Option.REAR_VIEW_CAMERA);
        audi = new Audi(YEAR, ModelAudi.A8, EngineVolumeAudi.MEDIUM_VOLUME, ColourAudi.BLUE,
                WheelSizeAudi.MEDIUM, option, Transmission.MANUAL);
        this.storage.addCarToStorage(audi);
    }


}
