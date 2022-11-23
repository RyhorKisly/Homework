package Homework_from_Roman.hw4.factories;

import Homework_from_Roman.hw4.cars.Car;

import static java.lang.String.format;

public interface Factory  {

    public String getConfigurations();

    public Car createCar();

}
