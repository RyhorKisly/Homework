//Задача 1:
//Задача с месяцами года.
//
//Необходимо реализовоть класс который имеет два метода:
//1) определить номер месяца по имени.
//2) определить имя месяца по номеру.

package Homework_from_Roman.Classes;


import java.util.Arrays;

public enum Months {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private int number;
        private String title;

        Months(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

}
