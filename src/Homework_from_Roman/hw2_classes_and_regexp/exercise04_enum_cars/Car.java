// Задача 4:
// Необходимо реализовать класс Car,  который имеет поля марка и цвет.
//
// Марки имеют следующие цвета:
// Audi - Синий. Красный. Зеленый
// BMW - Оранжевый. Черный. Фиолетовый
// KIA -  Желтый. Cерый. Белый
//
// Ожидается метод который изметяет цвет.
// Как параметр принимает строку, если цвет не верный
// то ничего не изменяет.
//
//package Homework_from_Roman.hw2.exercise04;

package Homework_from_Roman.hw2_classes_and_regexp.exercise04_enum_cars;

import static Homework_from_Roman.hw2_classes_and_regexp.exercise04_enum_cars.Brand.*;
import static Homework_from_Roman.hw2_classes_and_regexp.exercise04_enum_cars.Color.*;

public class Car {

    private Color color;
    private static Brand brand;

    public Car(Brand brand, Color color) {
        this.brand = brand;
        for(Color c : brand.getColors()) {
            if(c == color) {
                this.color = color;
                break;
            }
        }
    }

    public void setColor(String newColor) {
        for(Color col : brand.getColors()) {
            if(col.name().equals(newColor.toUpperCase())) {
                color = col;
            }
        }
    }

    public void printNewColor() {
        System.out.println("Новый цвет автомобиля: " + color);
    }


    public static void main(String[] args) {

        Car car = new Car(AUDI, BLUE);
        car.setColor("RED");
        car.printNewColor();

        }

    }

