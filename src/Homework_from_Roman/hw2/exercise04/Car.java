package Homework_from_Roman.hw2.exercise04;// Задача 4:
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

import java.util.Random;

public class Car {

    private String[] brand;
    private String color;
    private static final Random RANDOM = new Random();

    public Car() {
    }

    public String changeColor(String[] brand, String color) {
        this.brand = brand;
        String temp = "";
        for (int i = 0; i < brand.length; i++) {
            if (color == brand[i]) {
                temp = brand[0];
                brand[0] = brand[i];
                brand[i] = temp;
                i = RANDOM.nextInt(1, 3);
                color = brand[i];
            }
        }
        this.color = color;
        return color;

    }

    public void printNewColor() {
        System.out.println("Новый цвет автомобиля: " + color);
    }


    public static void main(String[] args) {

        String[] Audi = {"Синий", "Красный", "Зелёный"};
        String[] BMW ={"Оранжевый", "Чёрный", "Фиолетовый"};
        String[] KIA ={"Жёлтый", "Серый", "Белый"};

        Car car = new Car();
        car.changeColor(Audi, "Красный");
        car.printNewColor();

        }

    }

