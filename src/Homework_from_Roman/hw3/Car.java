package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class Car{

    final Brand brand = Brand.BMW;
    final YearOfIssue yearOfIssue = YearOfIssue.NEW;
    final EngineVolume engineVolume = EngineVolume.BIG_VOLUME;
    Color color;
    WheelSize wheelSize;
    String[] array;
    int index = 0;

    public Car(int lengthOfOptionList) {
        this.array = new String[lengthOfOptionList];
    }

    public Car() {

    }
    public Car(Color color, WheelSize wheelSize) {
        this.color = color;
        this.wheelSize = wheelSize;
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

    public void addOption(OptionList optionList) {
        System.out.println(String.valueOf(optionList));
            if (index < 3) {
                array[index] = String.valueOf(optionList);
                index++;
            } else {
                System.out.println("Нельзя добавить более трёх опций");
            }
    }

    public void deleteOption(OptionList optionList) {
        String temp;
        for (index = 0; index < array.length; index++) {
            if (array[index] == String.valueOf(optionList)) {
                temp = array[2];
                array[2] = array[index];
                array[index] = temp;
                array[2] = null;
                break;
            } else {
                System.out.println("У автомобился нет такой опции");
            }
        }
    }

        public void checkOption() {
            System.out.println("В автомобиле присутствуют следующие опции:");
            for(String element : array) {
                System.out.println(element);
            }
        }

    public String toString() {
        return "Информация об авто: \n" +
                "Марка: " + this.brand + "; " +
                "Цвет: " + this.color + "; " +
                "Год выпуска: " + this.yearOfIssue + "(" + this.yearOfIssue.year + ")" + "; " +
                "Размер колёс: " + this.wheelSize + "(" + this.wheelSize.size + ")" + "; " +
                "Объём двигателя: " + this.engineVolume + "(" + this.engineVolume.volume  + ")" + ".";
    }

        public void printInfoAboutAuto() {
            System.out.println();
        }



    public static void main(String[] args) {

        Car car = new Car(Color.RED, WheelSize.MEDIUM);
        Car array = new Car(3);
        car.changeColor(Color.WHITE);
        car.changeWheelSize(WheelSize.SMALL);
        System.out.println();

        array.addOption(OptionList.LEATHER_SEATS);
        array.checkOption();
        System.out.println();

        array.deleteOption(OptionList.LEATHER_SEATS);
        array.checkOption();
        System.out.println();

        System.out.println(car.toString());

    }
}
