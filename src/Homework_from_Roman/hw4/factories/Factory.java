package Homework_from_Roman.hw4.factories;

import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.colours.Colour;
import Homework_from_Roman.hw4.brand.enums.colours.ColourBMW;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolume;
import Homework_from_Roman.hw4.brand.enums.models.Model;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSize;

import java.util.Arrays;
import java.util.Set;

import static java.lang.String.format;


public class Factory {

    private static final int YEAR = 2022;

    private final Colour[] colour;
    private final Model[] model;
    private final WheelSize[] wheelSize;
    private final EngineVolume[] engineVolume;

    private final Storage storage;

    public Factory(Colour[] colour, Model[] model, WheelSize[] wheelSize, EngineVolume[] engineVolume) {
        this.colour = colour;
        this.model = model;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.storage = new Storage();
        fillStorageWithCars();
    }

    public Car createCar(Model model, EngineVolume engineVolume, Colour colour, WheelSize wheelSize, Set<Option> option) {
        Car car = storage.getCarFromStorage(model, engineVolume, colour, wheelSize, option);
        if (car != null) {
            if (car.getColor() != colour) {
                car.setColor(colour);
            }
            if (car.getWheelSize() != wheelSize) {
                car.setWheelSize(wheelSize);
            }
            if (!car.getOption().equals(option)) {
                car.setOption(option);
            }
            System.out.println("Автомобиль взяли со склада");
            return car;
        }
        return new Car(YEAR, model, engineVolume, colour, wheelSize, option);
    }

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(colour),
                Arrays.toString(model),
                Arrays.toString(wheelSize),
                Arrays.toString(engineVolume)
        );
    }

    private void fillStorageWithCars() {
        // Any custom logic about creating initial cars.
//        Car car = new Car(YEAR, Model.BMW, EngineVolume.BIG_VOLUME, Color.RED, WheelSize.SMALL, new HashSet<>());
//        this.storage.addCarToStorage(car);
//        Set<Option> option = new HashSet<>();
//        option.add(Option.AUTOMATIC_TRANSMISSION);
//        car = new Car(YEAR, Model.AUDI, EngineVolume.MEDIUM_VOLUME, Color.BLACK, WheelSize.MEDIUM, option);
//        this.storage.addCarToStorage(car);
    }



}
