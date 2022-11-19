package Homework_from_Roman.hw4.factory;

import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.commonFields.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Storage {

    private final List<Car> cars = new ArrayList<>();

    public void addCarToStorage(Car car) {
        cars.add(car);
    }

    public Car getCarFromStorage(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> option) {
        Iterator<Car> iterator = cars.listIterator();
        List<Car> removed = new ArrayList<>();
        Car car = null;
        while (iterator.hasNext()) {
            Car temp = iterator.next();
            if (verifyModelEngine(temp, model, engineVolume)) {
                if (car == null) {
                    car = temp;
                    iterator.remove();
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    iterator.remove();
                    removed.add(car);
                    car = temp;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && car.getWheelSize() != wheelSize) {
                    iterator.remove();
                    removed.add(car);
                    car = temp;
                    continue;
                }
                if (temp.getOption().equals(option) && !car.getOption().equals(option)) {
                    iterator.remove();
                    removed.add(car);
                    car = temp;
                }
            }
        }
        cars.addAll(removed);
        System.out.println("Осталось машин на складе: ");
        for(Car element : cars){
            System.out.println(element);
        }
        return car;
    }

    private boolean verifyModelEngine(Car car, Model model, EngineVolume engineVolume) {
        return car.getModel() == model && car.getEngineVolume() == engineVolume;
    }

}
