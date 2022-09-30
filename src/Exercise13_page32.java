/* Задание: Вычислить призведение чисел от 1 до 25 с помощью цикла do while. */

public class Exercise13_page32 {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 1;
        do {
            x *= y;
            y++;
            z++;
        } while (z <= 24);
        System.out.println("Факторила целых чисел от 1 до 25 равен:" + x);
    }
}
