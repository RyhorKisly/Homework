/*
Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
положительных или отрицательных.
*/

package Homework_from_Roman.Arrays;

public class Exercise_4 {
    public static void main(String[] args) {

        int x = 10;
        int arrays[][] = new int[x][x];                            // исходные значения
        int lineslength = 0;
        int numberNegative = 0;
        int numberPositive = 0;
        int random = (int)(Math.random() * x + 1);                 // делаем массив рандомным

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = j - random;                         // наполняем массив элементами
                if (arrays[i][j] < 0) {
                    numberNegative ++;
                } else if (arrays[i][j] > 0) {
                    numberPositive ++;
                }
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество положительных чисел: " + numberPositive);
        System.out.println("Количество отрицательный чисел: " + numberNegative);
        System.out.println();
        if (numberPositive > numberNegative) {
            System.out.println("Количество положительных чисел " +
                    "больше количества отрицательных чисел.");
        } else if (numberNegative > numberPositive) {
            System.out.println("Количество отрицательных чисел " +
                    "больше количества положительных чисел.");
        } else {
            System.out.println("Количество положительных и отрицательных чисел одинаково.");
        }

    }
}
