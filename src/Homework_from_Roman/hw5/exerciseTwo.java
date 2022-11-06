//        2
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. После чего программа выведет среднее из всех
//        введенных значений.

package Homework_from_Roman.hw5;

import java.io.IOException;
import java.util.Scanner;

public class exerciseTwo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int number = 0;
        int accumulate = 0;
        int sum = 0;
        try{
        while (true) {
            if (in.hasNextInt()) {
                accumulate++;
                number = in.nextInt();
                sum += number;
                System.out.println(number);
            } else {
                if(in.next().equals("ESC")) {
                        break;
                }
                System.out.println("Введите число или stop слово: \"ESC\"");
            }
        }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                in.close();
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
            }
        }


        System.out.println("Среднее значение введённых чисел равно: " + (sum / number));
        System.out.println("Количество введённых чисел: " + accumulate);
    }
}
