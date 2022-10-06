/* Задание: Для целых чисел, которые деляться на 7 в диапазоне от 1 до 100, вывести на
экран строку "Hope!" */

public class Exercise16_page33 {
    public static void main(String[] args) {

        for (int x = 1; x >= 1 && x <= 100; x++) {
            if (x % 7 == 0) {
                System.out.println(x + " = \"Hope!\"");
            }
        }
    }
}
