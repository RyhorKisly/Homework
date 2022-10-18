//		Задание *
//		Есть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]
//		Необходимо написать программу которая посчитает максимально возможную сумму
//		которую можно получить из данного массива, с условием что элементы включенные в
//		сумму не должны стоять на соседних индексах (должен быть минимум один елемент
//				между ними).
//
//		Для предложенного массива это: 1, 4, 9 = 14.

package Homework_from_Roman.hw1_Arrays;

public class Exercise_7_I_do_not_understand {
    public static void main(String[] args) {

//        int[] array = {3, 9, 9, 2, 9, 1, 9, 8, 2, 3, 4, 5, 7, 6, 5, 1};
//        int maxIndex = 0;
//        int x = 0;
//        int sum = 0;
//        int allIndexsum = 0;

        int[] array = {3, 9, 9, 2, 9, 1, 9, 8, 2, 3, 4, 5, 7, 6, 5, 1};
        int sum = array[0];
        int prevSum = 0;


        for (int i = 1; i < array.length; i++) {
            int temp = sum;
            sum = Math.max(Math.max(prevSum + array[i], array[i]), sum);
            prevSum = temp;
        }

        System.out.println(sum);

    }
}

