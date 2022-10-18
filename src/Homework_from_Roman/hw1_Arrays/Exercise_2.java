/*
Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до
определенного индекса "n".
Например:
Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
n = 7
Сумма всех четных до 7го.  равна 2 + 8 = 10.
*/

package Homework_from_Roman.hw1_Arrays;

public class Exercise_2 {
    public static void main(String[] args) {

        int x = 30;                     //
        long[] f = new long[x];
        int n = (int) (Math.random() * x);
        int sum = 0;
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            if (f[i] % 2 == 0) {
                sum += f[i];
            }
        }
        System.out.println();
        System.out.println("Длина массива из чисел фибоначи: " + (x) + ";" +
                "\n \nИндекс \"n\" равен: " + n + ";" +
                "\n\nCуvма всех чётных чисел фибоначи (до Индекса \"n\") равна: " + sum + ".");

    }
}
