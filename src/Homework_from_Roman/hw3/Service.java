package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class Service {
    private int index = 1;


    public static Color changeColor(Car car, Color color) {
        car.setColor(color);
//        System.out.println("Новый цвет авто: " + color);
        return car.getColor();
    }

    public static WheelSize changeWheelSize(Car car, WheelSize wheelSize) {
        car.setWheelSize(wheelSize);
//        System.out.println("Новый размер колёс: " + wheelSize);
        return car.getWheelSize();
    }

    public static String[] changeOptionList(Car car, OptionList optionList) {
        car.setArrayOptionList(optionList);
//        System.out.println("Новая опция: " + wheelSize);
        return car.getArrayOptionList();
    }

    public void addOption(Car car, OptionList optionList) {
            if (index < 3) {
                car.arrayOptionList[index] = String.valueOf(optionList);
                index++;
            } else {
                System.out.println("Нельзя добавить более трёх опций");
            }
    }

    public void deleteOption(Car car, OptionList optionList) {
        String temp;
        for (index = 0; index < car.arrayOptionList.length; index++) {
            if (car.arrayOptionList[index] == String.valueOf(optionList)) {
                temp = car.arrayOptionList[2];
                car.arrayOptionList[2] = car.arrayOptionList[index];
                car.arrayOptionList[index] = temp;
                car.arrayOptionList[2] = null;
                break;
            } else {
                System.out.println("У автомобился нет такой опции");
            }
        }
    }

        public void checkOption(Car car) {
            System.out.println("В автомобиле присутствуют следующие опции:");
            for(String element : car.arrayOptionList) {
                System.out.println(element);
            }
        }

}
