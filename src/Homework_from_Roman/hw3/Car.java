package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public abstract class Car{

    Color color;
    Brand brand;
    YearOfIssue yearOfIssue;
    WheelSize wheelSize;
    EngineVolume engineVolume;
    OptionList optionList;

    public Car(){
    }

    public Car(Color color, WheelSize wheelSize, OptionList optionList) {
        this.color = color;
        this.wheelSize = wheelSize;
        this.optionList = optionList;
    }

    public Car(Color color, Brand brand, YearOfIssue yearOfIssue, WheelSize wheelSize, EngineVolume engineVolume, OptionList optionList) {
        this.color = color;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.optionList = optionList;
    }

    public void changeOptions() {}


}
