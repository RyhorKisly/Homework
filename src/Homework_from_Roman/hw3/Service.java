package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class Service {

    public static Color changeColor(Car car, Color color) {
        if (car.getColor() != color) {
            car.setColor(color);
        }
//        System.out.println("Новый цвет авто: " + wheelSize);
        return car.getColor();
    }

    public static WheelSize changeWheelSize(Car car, WheelSize wheelSize) {
        if (car.getWheelSize() != wheelSize) {
            car.setWheelSize(wheelSize);
        }
//        System.out.println("Новый размер колёс: " + wheelSize);
        return car.getWheelSize();
    }

    public void addOption(Car car, OptionList option) {
        if (option != null) {
            for (int i = 0; i < car.arrayOptionList.length; i++) {
                if (car.arrayOptionList[i] == String.valueOf(option)) {
                    System.out.println("Такая опция уже есть");
                    break;
                } else if (car.arrayOptionList[i] == null || car.arrayOptionList[i] != String.valueOf(option)) {
                    car.arrayOptionList[i] = String.valueOf(option);
                    break;
                }
            }
        } else {
            System.out.println("Введите опцию вместо null");
        }
    }

    public void deleteOption(Car car, OptionList optionList) {
        String temp;
        for (int i = 0; i < car.arrayOptionList.length; i++) {
            if (car.arrayOptionList[i] == String.valueOf(optionList)) {
                temp = car.arrayOptionList[2];
                car.arrayOptionList[2] = car.arrayOptionList[i];
                car.arrayOptionList[i] = temp;
                car.arrayOptionList[2] = null;
                break;
            } else {
                System.out.println("У автомобился нет такой опции");
            }
        }
    }

}
