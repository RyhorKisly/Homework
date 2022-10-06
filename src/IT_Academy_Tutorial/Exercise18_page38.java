/* Задание: Создайте переменнуюд для массива из 10 элементов. Заполните его
* произвольными значениями целочисленного типа и выведите последний элемент массива на экран */

package IT_Academy_Tutorial;
public class Exercise18_page38 {
    public static void main(String[] args) {

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            if (i == array.length - 1) {
                System.out.println();
                System.out.println("Последняя цифра в массиве = " + array[i]);
                System.out.println();
            }
        }

    }
}
