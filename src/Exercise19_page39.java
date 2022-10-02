/* Создайте переменную для массива из 10 элементов. Заполните его
произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на чётных позициях. */

public class Exercise19_page39 {
    public static void main(String[] args) {

        int[] arrays = new int[10];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int)(Math.random() * 10 + 1);
            if (arrays[i] % 2 == 0) {
                System.out.println(arrays[i]);
            }
        }

    }
}