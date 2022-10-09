/* Задание: Вычислить призведение чисел от 1 до 25 с помощью цикла do while. */

package IT_Academy_Tutorial;

import java.math.BigInteger;

public class Exercise13_page32 {
    public static void main(String[] args) {

        BigInteger result = BigInteger.ONE;
        int counter = 1;
        do {
            result = result.multiply(BigInteger.valueOf(counter));
        } while (counter++ < 25);
        System.out.println("Произведение чисел от 1 до 25 равно: " + result);

    }
}
