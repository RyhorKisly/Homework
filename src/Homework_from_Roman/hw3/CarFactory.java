package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;


public class CarFactory{

    private Service service;

    public CarFactory(Service service) {
        this.service = service;
    }

    public static Car createCar(Color color, Model model, int yearOfIssue,
                                WheelSize wheelSize, EngineVolume engineVolume, OptionList optionList){
        if (model == CarStorage.car1.getModel() &&
                yearOfIssue == CarStorage.car1.getYearOfIssue()  &&
                engineVolume == CarStorage.car1.getEngineVolume()) {
            Service.changeColor(CarStorage.car1, color);
            Service.changeWheelSize(CarStorage.car1, wheelSize);
            Service.changeOptionList(CarStorage.car1, optionList);
            return CarStorage.car1;
        } else if (model == CarStorage.car2.getModel() &&
                yearOfIssue == CarStorage.car2.getYearOfIssue()  &&
                engineVolume == CarStorage.car2.getEngineVolume()) {
            Service.changeColor(CarStorage.car2, color);
            Service.changeWheelSize(CarStorage.car2, wheelSize);
            Service.changeOptionList(CarStorage.car2, optionList);
            return CarStorage.car2;
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

}
