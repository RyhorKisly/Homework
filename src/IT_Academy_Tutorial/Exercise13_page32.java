/* Задание: Вычислить призведение чисел от 1 до 25 с помощью цикла do while. */

package IT_Academy_Tutorial;

import java.math.BigInteger;

public class Exercise13_page32 {
    public static void main(String[] args) {

        BigInteger x = BigInteger.valueOf(1);
        BigInteger y = BigInteger.valueOf(2);
        BigInteger z = BigInteger.valueOf(1);
        int s = 2;
        do {
            x = x.multiply(y);
            y = z.add(y);
            s++;
        } while (s <= 25);
        System.out.println("Произведение чисел от 1 до 25 равно:" + x);
    }
}
