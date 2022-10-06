/* Задание: Вычислить призведение чисел от 1 до 25 с помощью цикла do while. */

public class Exercise13_page32 {
    public static void main(String[] args) {

        double x = 1;
        int y = 2;
        do {
            x *= y++;
        } while (y <= 25);
        System.out.println("Произведение чисел от 1 до 25 равно:" + x);
    }
}
