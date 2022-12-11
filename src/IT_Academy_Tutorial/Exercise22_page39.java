// Создайте переменную для массива из 10 элементовю
// Заполните его произвольными значениями целочисленного типа
// Определите сумму элементов массива, расположенных между минимальным и максимальым значениями.
// Если значений максимальных и минимальных  несколько, то необходимо взять максимальное значение разницы индексов
//      между максимальным и минимальным значениями

package IT_Academy_Tutorial;

public class Exercise22_page39 {
    public static void main(String[] args) {
        int[] array = {3, 3, 3, 6, 8, 5, 7, 9, 17, 17, 15};
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] >= maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
            if(array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
