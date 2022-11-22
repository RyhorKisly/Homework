package Homework_from_Roman.hw4Two.factories;

import Homework_from_Roman.hw4Two.brand.Car;
import Homework_from_Roman.hw4Two.brand.enums.Option;

import java.util.Set;

public interface Factory <T, C, M, W, E> {

    public Car createCar(M model, E engineVolume, C colour, W wheelSize, Set<Option> option, T transmission);

    public String getConfigurations();

}
