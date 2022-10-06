/* Задание: Имеется прямоугольное отверстие размерами a и b, где a и b - целые числа.
Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число). */

package IT_Academy_Tutorial;
public class Exercise07_page26 {
    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        int r = 4;
        int g = (int)Math.sqrt((a * a) + (b * b));       // Вычислчем гипотенузу

        if (g < (2 * r)) {
            System.out.println("Можно закрыть круглой картонкой");
        } else {
            System.out.println("Нельзя закрыть круглой картонкой");
        }

    }
}
