package Homework_from_Roman.hw4.brand;

import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.Colour;
import Homework_from_Roman.hw4.brand.enums.EngineVolume;
import Homework_from_Roman.hw4.brand.enums.Model;
import Homework_from_Roman.hw4.brand.enums.WheelSize;

import java.util.Set;

public class Car {

    private final int year;
    private final Model model;
    private final EngineVolume engineVolume;

    private Colour color;
    private WheelSize wheelSize;
    private Set<Option> option;

    public Car(int year, Model model, EngineVolume engineVolume, Colour color, WheelSize wheelSize, Set<Option> option) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
        this.option = option;
    }

    public Colour getColor() {
        return color;
    }

    public Model getModel() {
        return model;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }

    public Set<Option> getOption() {
        return option;
    }

    public int getYear() {
        return year;
    }

    public void setColor(Colour color) {
        this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOption(Set<Option> option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model=" + model +
                ", engineVolume=" + engineVolume +
                ", color=" + color +
                ", wheelSize=" + wheelSize +
                ", option=" + option +
                '}';
    }

}
