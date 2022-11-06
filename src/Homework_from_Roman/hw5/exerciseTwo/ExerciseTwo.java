//        2
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. После чего программа выведет среднее из всех
//        введенных значений.

package Homework_from_Roman.hw5.exerciseTwo;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExerciseTwo {

    private Scanner in = new Scanner(System.in);
    private int number = 0;
    private int accumulate = 0;
    private int sum = 0;

    public void getMeanOfNumber() {
        try {
            while (true) {
                if (in.hasNextInt()) {
                    accumulate++;
                    number = in.nextInt();
                    sum += number;
                    System.out.println(number);
                } else {
                    if (in.next().equals("ESC")) {
                        break;
                    }
                    System.out.println("Введите число или stop слово: \"ESC\"");
                }
            }
        } catch (NoSuchElementException | IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                in.close();
            } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Среднее значение введённых чисел равно: " + (sum / accumulate));
            System.out.println("Количество введённых чисел: " + accumulate);
        }

    }
}
