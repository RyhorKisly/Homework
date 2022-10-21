package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class Car{

    private Color color;
    private final Brand brand;
    private final YearOfIssue yearOfIssue;
    private WheelSize wheelSize;
    private final EngineVolume engineVolume;
    private OptionList optionList;
    private final String[] array;

    public Car(int lengthOfOptionList) {
        this.array = new String[lengthOfOptionList];
    }


    public Car(Color color, Brand brand, YearOfIssue yearOfIssue, WheelSize wheelSize, EngineVolume engineVolume) {
        this.color = color;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
    }

    public Color changeColor(Color color) {
        this.color = color;
        System.out.println("Новый цвет авто: " + color);
        return this.color;
    }

    public WheelSize changeWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
        System.out.println("Новый размер колёс: " + wheelSize);
        return this.wheelSize;
    }

    public OptionList getOptionList() {
        return optionList;
    }

    public StringBuffer addOption() {

    }


    public static void main(String[] args) {
        Car car = new Car(Color.RED, Brand.BMW, YearOfIssue.NEW, WheelSize.MEDIUM, EngineVolume.BIG_VOLUME);
        car.changeColor(Color.WHITE);
        car.changeWheelSize(WheelSize.SMALL);


    }

}
