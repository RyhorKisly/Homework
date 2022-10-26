package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;


public class CarFactory{

    static Car[] carStorage;
    private Service service;

    public CarFactory(Color color, Model model, int yearOfIssue,
                      WheelSize wheelSize, EngineVolume engineVolume, String[] arrayOptionList) {
        Car storageCar1 = new Car(color, model, yearOfIssue, wheelSize, engineVolume, arrayOptionList);
        Car storageCar2 = new Car(color, model, yearOfIssue, wheelSize, engineVolume, arrayOptionList);
        Car storageCar3 = new Car(color, model, yearOfIssue, wheelSize, engineVolume, arrayOptionList);
        carStorage = new Car[]{storageCar1, storageCar2, storageCar3};
    }

    public static Car createCar(Color color, Model model, int yearOfIssue,
                                WheelSize wheelSize, EngineVolume engineVolume, String[] arrayOptionList){
        Car temp;
        for(int i = 0; i < carStorage.length; i++) {
           if (model == carStorage[i].getModel() &&
                   yearOfIssue == carStorage[i].getYearOfIssue() &&
                   engineVolume == carStorage[i].getEngineVolume()) {
               return carStorage[i];
           }
            temp = carStorage[2];
            carStorage[2] = carStorage[i];
            carStorage[i] = temp;
            carStorage[2] = null;
           break;
        }
        return new Car(color, model, yearOfIssue, wheelSize, engineVolume, arrayOptionList);
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
