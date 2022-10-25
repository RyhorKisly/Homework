package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;


public class CarFactory{

    private Service service;

    public CarFactory(Service service) {
        this.service = service;
    }

    public void printListOfModels() {
        System.out.println("Доступные марки машин:");
        for(Model element : Model.values()) {
            System.out.println(element);
        }
        System.out.println();
    }

    public void printListOfColors() {
        System.out.println("Доступные цвета машин:");
        for(Color element : Color.values()) {
            System.out.println(element);
        }
        System.out.println();
    }

    public void printListOfWheelSizes() {
        System.out.println("Доступные размеры колёс:");
        for(WheelSize element : WheelSize.values()) {
            System.out.println(element + "(" + element.size + ")");
        }
        System.out.println();
    }

    public void printListOfEngineVolumes() {
        System.out.println("Доступные объёмы двигателя:");
        for(EngineVolume element : EngineVolume.values()) {
            System.out.println(element + "(" + element.volume + ")");
        }
        System.out.println();
    }

    public Car createCar() {
        Car car = new Car(Color.RED, Model.RAPID, YearOfIssue.NEW,
                WheelSize.BIG, EngineVolume.BIG_VOLUME, OptionList.LEATHER_SEATS);
        if (car.getModel() == CarStorage.car1.getModel() &&
                CarStorage.car1.getYearOfIssue() == car.getYearOfIssue() &&
                CarStorage.car1.getEngineVolume() == car.getEngineVolume()) {
            return CarStorage.car1;
        } else if (car.getModel() == CarStorage.car2.getModel() &&
                CarStorage.car2.getYearOfIssue() == car.getYearOfIssue() &&
                CarStorage.car2.getEngineVolume() == car.getEngineVolume()) {
            return CarStorage.car2;
            } else {
            return car;
        }
    }

//    public Car[] carStorage(Car car1, Car car2) {         //Создал класс CarStorage
//        Car[] cars = new Car[2];
//        cars[0] = car1;
//        cars[1] = car2;
//        return cars;
//    }



}
