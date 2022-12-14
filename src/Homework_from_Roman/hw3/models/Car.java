package Homework_from_Roman.hw3.models;

import Homework_from_Roman.hw3.models.enums.*;

import java.util.Calendar;
import java.util.Set;

public class Car{

    private final int year;
    private final Model model;
    private final EngineVolume engineVolume;

    private Color color;
    private WheelSize wheelSize;
    private Set<Option> option;

    public Car(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> option) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
        this.option = option;
    }

    public Color getColor() {
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

    public void setColor(Color color) {
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
