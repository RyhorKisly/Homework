//        3
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. по команде "status" необходимо вывести введенные
//        цифры в отсортированном виде.

package Homework_from_Roman.hw5.exercise3;

import java.util.*;

public class ExerciseThree {

    private Scanner in = new Scanner(System.in);
    private List<Integer> arrayList = new ArrayList<>();
    private int number = 0;

    public void readNumbers() {
        System.out.println("Введите число. stop - остановить. status - вывести среднее значение");
        try {
            while (true) {

                if (in.hasNextInt()) {
                    number = in.nextInt();
                    arrayList.add(number);
                    System.out.println(number);
                } else if (in.next().equals("status")) {
                        Collections.sort(arrayList);
                        if(arrayList == null) {
                            System.out.println("Нет чисел");
                        } else {
                            getNumbers();
                        }

                    } else if (in.next().equals("stop")) {
                        break;
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
        }
    }

    public void getNumbers() {
        System.out.println("Введённые числа в отсортированном виде: ");
        try {
            for (Integer element : arrayList) {
                System.out.print(element + " ");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

