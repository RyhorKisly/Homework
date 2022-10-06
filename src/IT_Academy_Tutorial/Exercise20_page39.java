/* Создайте переменную для массива из 10 элементов (другим способом). Заполните его
произвольными значениями целочисленного типа. Найдите максимльный элемент
и выведите его индекс. */

package IT_Academy_Tutorial;
public class Exercise20_page39 {
    public static void main(String[] args) {

        int[] arrays = {4, 9, 54, 1, 2, 6, 4, 8, 7, 6};
        int maxIndex = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > arrays[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс максимального элемента равен: " + maxIndex);
    }
}