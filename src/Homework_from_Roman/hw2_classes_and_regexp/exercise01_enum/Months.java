//Задача 1:
//Задача с месяцами года.
//
//Необходимо реализовоть класс который имеет два метода:
//1) определить номер месяца по имени.
//2) определить имя месяца по номеру.

package Homework_from_Roman.hw2_classes_and_regexp.exercise01_enum;

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

        Months(int number) {
            this.number = number;
        }

        public static int getNumberByName (String name) {
                for (Months month : values()) {
                        if(month.name().equalsIgnoreCase(name)) {
                                return month.number;
                        }
                }
                return -1;
        }

        public static String getNameByNumber (int number) {
                for (Months month : values()) {
                        if(month.number == number) {
                                return month.name();
                        }
                }
                return null;
        }

        public static void main(String[] args) {

                System.out.println(getNumberByName("January"));
                System.out.println(getNameByNumber(5));

        }

}
