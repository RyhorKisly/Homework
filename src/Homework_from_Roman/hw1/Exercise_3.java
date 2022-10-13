/* Дан некоторый массив, суть задания инвертировать его. */

package Homework_from_Roman.hw1;

public class Exercise_3 {
    public static void main(String[] args) {

        int[] arrays = {3, 5, -2, 4, 4, 2, 8, 1, 4};                                   // исходное значение
        int invert = 0;

        for (int i = 0; i < arrays.length / 2; i++) {
            arrays[i] = arrays[i] + arrays[arrays.length - 1 - i];
            arrays[arrays.length - 1 - i] = arrays[i] - arrays[arrays.length - 1 - i];
            arrays[i] = arrays[i] - arrays[arrays.length - 1 - i];
            System.out.print(arrays[i] + " ");
        }

        for (int i = arrays.length / 2; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
