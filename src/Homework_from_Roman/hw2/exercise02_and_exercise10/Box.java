// Задача 2:
// Задача с классом Box.
// Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
// 1) Куб (Все стороны равны).
// 2) Обычная коробка.
// 3) Конверт (Есть только длинна и ширина).
//
//Задача 10:
//Используя класс Box из задания 2, необходимо
//добавить в него конструктор который принимает строку вида:
//
//Box[1,2,3] или Box[2] или Box[1,2]
//
//И как результат создает соответствующий обьект.

        package Homework_from_Roman.hw2.exercise02_and_exercise10;

import java.util.Random;

public class Box {
    private String typeOfBox;
    private int length;
    private int width;
    private int height;
    private static final Random RANDOM = new Random();

    public Box(String typeOfBox, int length, int width, int height) {
        this.typeOfBox = typeOfBox;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(String box) {
        int length = RANDOM.nextInt(10);
        int width = RANDOM.nextInt(10);
        int height = RANDOM.nextInt(10);
        if (box.equals("Box[1,2,3]") && (length * width * height != 0)) {
            Box box2  = new Box ("BoxType", length, width, height);
            this.length = length;
            this.width = width;
            this.height = height;
        } else if (box.equals("Box[1,2]") && (length * width != 0)) {
            this.length = length;
            this.width = width;
            this.height = 0;
        } else if (box.equals("Box[2]") && length != 0) {
            this.length = length;
            this.width = length;
            this.height = length;
        }
    }

    public String getTypeOfBox() {
        return typeOfBox;
    }

    public void print() {
        System.out.println(
                "Тип коробки: " + typeOfBox +
                        " Длина: " + length +
                        "; Ширина: " + width +
                        "; Высота: " + height + "."
        );
    }

    public void printTypeBox() {
        if (length * width * height < 0) {
            typeOfBox = "Неизвестный тип коробки:";
        }else if (length == width && width == height && (length != 0)) {
            typeOfBox = "Это Куб:";
        } else if (height == 0 && (length * width != 0)) {
            typeOfBox = "Это конверт:";
        } else if ((length * width * height != 0)) {
            typeOfBox = "Это обычная коробка:";
        }  else {
            typeOfBox = "Неизвестный тип коробки:";
        }
        print();
    }



}
