//Задача 3:
//Необходимо создать класс который имеет метод чтобы накапливать 5 последних переданных
//в него цифровых значений. Так же необходимо создать метод который выводит
//среднее из накопленных значений.

package Homework_from_Roman.hw2.exercise03;

import java.util.Arrays;
import java.util.Random;

public class Number {

    static int[] array;
    static int[] arrayAccumulate;
    private static final Random RANDOM = new Random();

    public static int[] createElementsOfArray(int count) {
        if(count >= 5) {
            int[] array = new int[count];
            Number.array = array;
            for (int i = 0; i < array.length; i++) {
                array[i] = RANDOM.nextInt(10);
            }
            return array;
        } else {
            return null;
        }

    }

    public static void accumulate5LastElements(int[] arrays) {
        Number.arrayAccumulate = Arrays.copyOfRange(arrays, arrays.length - 5, arrays.length);
    }

    public static void averageArray(int[] arrays) {
        double sum = 0;
        double averageNumber;
        for (int number : arrays) {
            sum += number;
        }
        averageNumber = sum / arrays.length;
        System.out.println("Среднее значение Массива равно: " + averageNumber);
    }


    public static void printArrays(int[] arrays) {
        System.out.println(Arrays.toString(arrays));
    }

}
