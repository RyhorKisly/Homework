//        2
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. После чего программа выведет среднее из всех
//        введенных значений.

package Homework_from_Roman.hw5.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExerciseTwo {
    private int count = 0;
    private double sum = 0d;

    public void calcMeanOfNumbers() {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in))) {
            System.out.println("Type an numbers, to stop type: 'stop'.");
            while (true) {
                Integer temp = readNumberOrStopCommand(
                        br, false, "stop");
                if (temp == null) {
                    System.out.println("Middle number is: " + sum / count);
                    return;
                }
                sum += temp;
                count++;
            }
        } catch (IOException e) {
            System.err.println("Can`t read lines from console.");
        }
    }

    private static Integer readNumberOrStopCommand(BufferedReader reader, boolean positiveOnly, String stop) throws IOException {
        while (true) {
            try {
                String line = reader.readLine();
                if (stop != null && stop.equalsIgnoreCase(line)) {
                    return null;
                }
                int num = Integer.parseInt(line);
                if (positiveOnly && num < 0) {
                    System.out.println("Number should be positive");
                    continue;
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please write valid number:");
            }
        }
    }

}

