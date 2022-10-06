/* Задание: Задать целое число в виде переменной, это число - сумма денег в рублях.
Вывести это число на экран, добавив к нему слово "рублей" в правильном падеже. */

package IT_Academy_Tutorial;
public class Exercise08_page27 {
    public static void main(String[] args) {

        int x = 213;
        int y = x % 10;
        int z = x % 100;
        if (y == 1 && z != 11) {
            System.out.println("x = " + x + " рубль");
        } else if (y >= 2 && y <= 4 && z != 12 && z != 13 && z != 14) {
            System.out.println("x = " + x + " рубля");
        } else if (x % 100 >= 11 && z <= 19){
            System.out.println("x = " + x + " рублей");
        }else {
            System.out.println("x = " + x + " рублей");
        }
    }
}
