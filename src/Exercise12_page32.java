/* Задание: Вычислить факториал целых чисел от 0 до 10 с помощью цикла while. */

public class Exercise12_page32 {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 1;
        while (z <= 9) {
            x *= y;
            y++;
            z++;
        }
        System.out.println("Факторила целых чисел от 0 до 10 равен:" + x);
    }
}
