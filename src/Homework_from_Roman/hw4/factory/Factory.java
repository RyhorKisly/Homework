package Homework_from_Roman.hw4.factory;

import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSize;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolume;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;


public class Factory {

    private static final int YEAR = 2022;

    private final Color[] color;
    private final Model[] model;
    private final WheelSize[] wheelSize;
    private final EngineVolume[] engineVolume;

    private final Storage storage;

    public Factory(Color[] color, Model[] model, WheelSize[] wheelSize, EngineVolume[] engineVolume) {
        this.color = color;
        this.model = model;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.storage = new Storage();
        fillStorageWithCars();
    }

    public Car createCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> option) {
        Car car = storage.getCarFromStorage(model, engineVolume, color, wheelSize, option);
        if (car != null) {
            if (car.getColor() != color) {
                car.setColor(color);
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
        return new Car(YEAR, model, engineVolume, color, wheelSize, option);
    }

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(color),
                Arrays.toString(model),
                Arrays.toString(wheelSize),
                Arrays.toString(engineVolume)
        );
    }

    private void fillStorageWithCars() {
        // Any custom logic about creating initial cars.
        Car car = new Car(YEAR, Model.BMW, EngineVolume.BIG_VOLUME, Color.RED, WheelSize.SMALL, new HashSet<>());
        this.storage.addCarToStorage(car);
        Set<Option> option = new HashSet<>();
        option.add(Option.AUTOMATIC_TRANSMISSION);
        car = new Car(YEAR, Model.AUDI, EngineVolume.MEDIUM_VOLUME, Color.BLACK, WheelSize.MEDIUM, option);
        this.storage.addCarToStorage(car);
    }



}
