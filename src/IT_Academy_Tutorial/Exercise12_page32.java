/* Задание: Вычислить факториал целых чисел от 0 до 10 с помощью цикла while. */

package IT_Academy_Tutorial;
public class Exercise12_page32 {
    public static void main(String[] args) {



        int x = 1;
        int y = 1;
        System.out.println("Факториал числа 0 равен: 0");
        while (y <= 10) {
            x *= y;
            System.out.println("Факториал числа " +  y++ +  " равен: " + x);
        }

    }
}
