/* Задание: Задать целое число в виде переменной, это число - сумма денег в рублях.
Вывести это число на экран, добавив к нему слово "рублей" в правильном падеже. */

public class Exercise08_page27 {
    public static void main(String[] args) {

        int x = -269;
        int y = x % 10;
        if (y == 1) {
            System.out.println("x = " + x + " рубль");
        } else if (y >= 2 && y <= 4) {
            System.out.println("x = " + x + " рубля");
        } else {
            System.out.println("x = " + x + " рублей");
        }
    }
}
