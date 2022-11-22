package Homework_from_Roman.hw4.factories;

import Homework_from_Roman.hw4.brand.Audi;
import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.enumAudi.*;

import java.util.Set;

import static java.lang.String.format;

public interface Factory  {

    public String getConfigurations();

    public Car createCar();

}
