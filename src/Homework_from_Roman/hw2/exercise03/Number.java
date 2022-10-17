//Задача 3:
//Необходимо создать класс который имеет метод чтобы накапливать 5 последних переданных
//в него цифровых значений. Так же необходимо создать метод который выводит
//среднее из накопленных значений.

package Homework_from_Roman.hw2.exercise03;

import java.util.Arrays;
import java.util.Random;

public class Number {

    private int i = 0;
    private static final int[] LENGTHNUMBER = new int[50];
    int sum = 0;
    double average = 0;

    public int consume(int count) {
        if (i < 5) {
            LENGTHNUMBER[i++] = count;
            sum += count;
        } else {
            LENGTHNUMBER[i] = count;
            sum += count;
            sum -= LENGTHNUMBER[i++ - 5];
        }
        System.out.println("sum: " + sum);
        return sum;
    }

    public void avg() {
        if (i < 5) {
            average = (double)sum / i;
        } else {
            average = (double)sum / 5;
        }
        System.out.println(average);
    }

    public static void main(String[] args) {

        Number number = new Number();
        
        number.consume(10);
        number.consume(5);
        number.consume(5);
        number.consume(5);
        number.consume(5);

        number.avg();

    }

}
