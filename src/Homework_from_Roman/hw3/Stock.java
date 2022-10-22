package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class Stock {

    Brand brand;
    Color color;
    YearOfIssue yearOfIssue;
    WheelSize wheelSize;
    EngineVolume engineVolume;

    public Stock(Brand brand, Color color, YearOfIssue yearOfIssue,
                      WheelSize wheelSize, EngineVolume engineVolume) {
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public String toString() {
        return "Информация об авто со склада: \n" +
                "Марка: " + this.brand + "; " +
                "Цвет: " + this.color + "; " +
                "Год выпуска: " + this.yearOfIssue + "(" + this.yearOfIssue.year + ")" + "; " +
                "Размер колёс: " + this.wheelSize + "(" + this.wheelSize.size + ")" + "; " +
                "Объём двигателя: " + this.engineVolume + "(" + this.engineVolume.volume  + ")" + ".";
    }

}
