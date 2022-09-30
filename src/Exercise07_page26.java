/* Задание: Имеется прямоугольное отверстие размерами a и b, где a и b - целые числа.
Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число). */

public class Exercise07_page26 {
    public static void main(String[] args) {

        int a = 6;
        int b = 17;
        int r = 10;

        if (a <= 0 || b <= 0 || r<=0) {
            System.out.println("Not in this world)");
        } else if ((a * a) + (b * b) > (r * r)) {
            System.out.println("You can't cover this rectangle");
        } else {
            System.out.println("You can cover this rectangle");
        }

    }
}
