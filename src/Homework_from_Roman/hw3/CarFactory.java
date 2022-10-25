package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;


public class CarFactory{

    private Service service;

    public CarFactory(Service service) {
        this.service = service;
    }

    public static Car createCar(Color color, Model model, YearOfIssue yearOfIssue,
                                WheelSize wheelSize, EngineVolume engineVolume, OptionList optionList){
        if (model == CarStorage.car1.getModel() &&
                yearOfIssue == CarStorage.car1.getYearOfIssue()  &&
                engineVolume == CarStorage.car1.getEngineVolume()) {
            return CarStorage.car1;
        } else if (model == CarStorage.car2.getModel() &&
                yearOfIssue == CarStorage.car2.getYearOfIssue()  &&
                engineVolume == CarStorage.car2.getEngineVolume()) {
            return CarStorage.car1;
        } else {
            Car car = new Car(color, model, yearOfIssue, wheelSize, engineVolume, optionList);
            return car;
        }
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




//    public Car[] carStorage(Car car1, Car car2) {         //Создал класс CarStorage
//        Car[] cars = new Car[2];
//        cars[0] = car1;
//        cars[1] = car2;
//        return cars;
//    }



}
