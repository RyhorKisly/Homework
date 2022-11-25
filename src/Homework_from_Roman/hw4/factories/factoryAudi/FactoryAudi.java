package Homework_from_Roman.hw4.factories.factoryAudi;

import Homework_from_Roman.hw4.cars.Audi;
import Homework_from_Roman.hw4.cars.Car;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.SpecialOption;
import Homework_from_Roman.hw4.enums.enumAudi.ColourAudi;
import Homework_from_Roman.hw4.enums.enumAudi.EngineVolumeAudi;
import Homework_from_Roman.hw4.enums.enumAudi.ModelAudi;
import Homework_from_Roman.hw4.enums.enumAudi.Transmission;
import Homework_from_Roman.hw4.enums.enumAudi.WheelSizeAudi;
import Homework_from_Roman.hw4.factories.Factory;
import Homework_from_Roman.hw4.factories.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class FactoryAudi extends Factory {

    private static final int YEAR = 2022;
    private final ColourAudi[] colour;
    private final ModelAudi[] model;
    private final WheelSizeAudi[] wheelSize;
    private final EngineVolumeAudi[] engineVolume;

    private final Transmission[] transmission;
    private final Storage<Transmission> storage;

    public FactoryAudi(ColourAudi[] colour, ModelAudi[] model, WheelSizeAudi[] wheelSize, EngineVolumeAudi[] engineVolume, Transmission[] transmission) {
        super(colour, model, wheelSize, engineVolume);
        this.colour = colour;
        this.model = model;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.storage = new Storage<>();
        fillStorageWithCars();
    }

    public Car createCar(ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi colour, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        Audi audi = (Audi) storage.getCarFromStorage(model, engineVolume, colour, wheelSize, option, transmission);
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
                "FactoryAudi can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(colour),
                Arrays.toString(model),
                Arrays.toString(wheelSize),
                Arrays.toString(engineVolume),
                Arrays.toString(transmission)
        );
    }

    public void fillStorageWithCars() {
        // Any custom logic about creating initial cars.
        Audi audi = new Audi(YEAR, ModelAudi.A4, EngineVolumeAudi.BIG_VOLUME, ColourAudi.RED, WheelSizeAudi.VERY_SMALL, new HashSet<>(), Transmission.AUTOMATIC);
        this.storage.addCarToStorage(audi);
        Set<Option> option = new HashSet<>();
        option.add(Option.REAR_VIEW_CAMERA);
        audi = new Audi(YEAR, ModelAudi.A8, EngineVolumeAudi.MEDIUM_VOLUME, ColourAudi.BLUE, WheelSizeAudi.MEDIUM, new HashSet<>(), Transmission.MANUAL);
        this.storage.addCarToStorage(audi);
    }


}
