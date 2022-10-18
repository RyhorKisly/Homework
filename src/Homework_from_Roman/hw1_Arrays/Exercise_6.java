/*
Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
сумму и разности.
*/

package Homework_from_Roman.hw1_Arrays;

public class Exercise_6 {
    public static void main(String[] args) {

        int x = 5;                                   // Исходная длина массивов
        int[][] array1 = new int[x][x];
        int[][] array2 = new int[x][x];
        int[][] arraySum = new int[x][x];
        int[][] arrayDif = new int[x][x];

        for (int j = 0; j < array1.length; j++) {                    // создаём элементы первого массива
            for (int i = 0; i < array1.length; i++) {
                array1[j][i] = (int) (Math.random() * 10);
                System.out.print(array1[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 0; j < array1.length; j++) {                    // создаём элементы второго массива
            for (int i = 0; i < array1.length; i++) {
                array2[j][i] = (int) (Math.random() * 10);
                System.out.print(array2[j][i] + " ");
            }
            System.out.println();
        }

            for (int j = 0; j < array1.length; j++) {               // Создаём сложеный или вычтеный массив
                for (int i = 0; i < array1.length; i++) {
                    arraySum[j][i] = array1[j][i] + array2[j][i];
                    arrayDif[j][i] = array1[j][i] - array2[j][i];
                }
            }
        System.out.println();

        System.out.println("Сумма матриц");
            for (int[] subArray : arraySum) {
                for (int element : subArray) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        System.out.println();

        System.out.println("Разница матриц");
        for (int[] subArray : arrayDif) {
            for (int element : subArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


    }
}
