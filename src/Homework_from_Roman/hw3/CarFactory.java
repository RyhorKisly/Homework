package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;


public class CarFactory{

    public CarFactory() {
    }

    public void listOfBrand() {
        System.out.println("Доступные марки машин:");
        for(Brand element : Brand.values()) {
            System.out.println(element);
        }
        System.out.println();
    }

    public void listOfColor() {
        System.out.println("Доступные цвета машин:");
        for(Color element : Color.values()) {
            System.out.println(element);
        }
        System.out.println();
    }

    public void listOfWheelSize() {
        System.out.println("Доступные размеры колёс:");
        for(WheelSize element : WheelSize.values()) {
            System.out.println(element + ": " + element.size);
        }
        System.out.println();
    }

    public void listOfEngineVolume() {
        System.out.println("Доступные объёмы двигателя:");
        for(EngineVolume element : EngineVolume.values()) {
            System.out.println(element + ": " + element.volume + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.listOfBrand();
        carFactory.listOfColor();
        carFactory.listOfWheelSize();
        carFactory.listOfEngineVolume();



    }

}
