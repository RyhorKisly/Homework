/*
Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
"n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
встречается число "n" то в сумму его включать не нужно.
 */

package Homework_from_Roman.hw1_Arrays;

public class Exercise_1 {
    public static void main(String[] args) {

        int[] array = new int[999];
        int   n = (int) (Math.random() * 100 + 1);
        int   sum = 0;

        System.out.println("Число n равно: " + n);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.println("Элемент массива № " + i + " = " + array[i]);
            if (n != array[i]) {
                sum += array[i];
            }
        }

        System.out.println();
        System.out.println("Сумма чисел в массиве без учёта числа n = " + sum);

    }
}