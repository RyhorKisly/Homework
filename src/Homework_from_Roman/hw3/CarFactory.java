package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;


public class CarFactory{

    Brand brand;
    Color color;
    YearOfIssue yearOfIssue;
    WheelSize wheelSize;
    EngineVolume engineVolume;

    public CarFactory(Brand brand, Color color, YearOfIssue yearOfIssue,
                      WheelSize wheelSize, EngineVolume engineVolume) {
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

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
            System.out.println(element + "(" + element.size + ")");
        }
        System.out.println();
    }

    public void listOfEngineVolume() {
        System.out.println("Доступные объёмы двигателя:");
        for(EngineVolume element : EngineVolume.values()) {
            System.out.println(element + "(" + element.volume + ")");
        }
        System.out.println();
    }

    public String toString() {
        return "Информация об авто с завода: \n" +
                "Марка: " + this.brand + "; " +
                "Цвет: " + this.color + "; " +
                "Год выпуска: " + this.yearOfIssue + "(" + this.yearOfIssue.year + ")" + "; " +
                "Размер колёс: " + this.wheelSize + "(" + this.wheelSize.size + ")" + "; " +
                "Объём двигателя: " + this.engineVolume + "(" + this.engineVolume.volume  + ")" + ".";
    }

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.listOfBrand();
        carFactory.listOfColor();
        carFactory.listOfWheelSize();
        carFactory.listOfEngineVolume();
        System.out.println();

        Stock newAutoFromStock = new Stock(Brand.AUDI, Color.WHITE, YearOfIssue.NEW, WheelSize.BIG,
                EngineVolume.MEDIUM_VOLUME);

        CarFactory newAutoFromFactory = new CarFactory(Brand.AUDI, Color.WHITE, YearOfIssue.NEW, WheelSize.BIG,
                EngineVolume.MEDIUM_VOLUME);

        System.out.println(newAutoFromStock.toString());
        System.out.println();
        System.out.println(newAutoFromFactory.toString());



    }

}
