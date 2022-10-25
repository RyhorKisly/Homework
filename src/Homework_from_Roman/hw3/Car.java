package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

import java.util.Arrays;

public class Car{

    private Color color;
    private final Model model;
    private final YearOfIssue yearOfIssue;
    private WheelSize wheelSize;
    private final EngineVolume engineVolume;
    String[] arrayOptionList = new String[3];

    public Car(Color color, Model model, YearOfIssue yearOfIssue, WheelSize wheelSize, EngineVolume engineVolume, OptionList optionList) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.arrayOptionList[0] = String.valueOf(optionList);

    }

    public String toString() {
        return "Информация об авто: \n" +
                "Цвет: " + this.color + "; " +
                "Марка: " + this.model + "; " +
                "Год выпуска: " + this.yearOfIssue + "(" + this.yearOfIssue.year + ")" + "; " +
                "Размер колёс: " + this.wheelSize + "(" + this.wheelSize.size + ")" + "; " +
                "Объём двигателя: " + this.engineVolume + "(" + this.engineVolume.volume  + ")" + ";\n" +
                "Cписок опций: " + Arrays.toString(arrayOptionList) + ".";
    }

    public Color getColor() {
        return color;
    }

    public Model getModel() {
        return model;
    }

    public YearOfIssue getYearOfIssue() {
        return yearOfIssue;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }

    public String[] getArrayOptionList() {
        return arrayOptionList;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setArrayOptionList(String[] arrayOptionList) {
        this.arrayOptionList = arrayOptionList;
    }

}
