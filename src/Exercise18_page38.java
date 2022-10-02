/* Задание: Создайте переменнуюд для массива из 10 элементов. Заполните его
* произвольными значениями целочисленного типа и выведите последний элемент массива на экран */

public class Exercise18_page38 {
    public static void main(String[] args) {

        int array[] = new int[10];
        int length = array.length;
        if (length  == 0) {
            System.out.println("А так можно?");
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10 + 1);
                if (i == length - 1) {
                    System.out.println();
                    System.out.println("Последняя цифра в массиве = " + array[i]);
                    System.out.println();
                }
            }
            for (int i = 0; i < array.length; i++) {                       // Для проверки
                System.out.println(i + " = " + array[i]);
            }
        }
    }
}
