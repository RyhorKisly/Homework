/*
Дан некоторый двумерный массив. Нужно определить является ли он нижней
треугольной матрицей или же нет.
*/

package Homework_from_Roman.hw1_Arrays;

public class Exercise_5 {
    public static void main(String[] args) {

		int[][] arrays = {
				{1, 0, 0, 0, 0},
				{2, 1, 0, 0, 0},
				{3, 5, 6, 0, 0},
				{1, 0, 5, 7, 0},
				{0, 8, 9, 1, 3}
		};
        boolean b = true;

        label: for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays[i].length; j++) {
                if (arrays[i][j] != 0) {
					b = false;
					break label;
				}
            }

        }

        if (b == true) {
            System.out.println();
            System.out.println("Массив является нижним треугольным");
        } else {
            System.out.println();
            System.out.println("Массив не является нижним треугольным");
        }
    }
}
