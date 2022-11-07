//        3
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. по команде "status" необходимо вывести введенные
//        цифры в отсортированном виде.

package Homework_from_Roman.hw5.exerciseThree;

import java.util.*;

public class ExerciseThree {

    private Scanner in = new Scanner(System.in);
    private List<Integer> arrayList;
    private int number = 0;

    public ExerciseThree(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void writeNumbers() {
        try {
            while (true) {
                if (in.hasNextInt()) {
                    number = in.nextInt();
                    arrayList.add(number);
                    System.out.println(number);
                } else {
                    if (in.next().equals("ESC")) {
                        break;
                    }
                    System.out.println("Введите целое число или stop слово: \"ESC\"");
                }
            }
            while (true) {
                if (in.nextLine().equals("status")) {
                    Collections.sort(arrayList);
                    break;
                } else {
                    System.out.println("Введите слово \"status\"");
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

    public void sortNumbers() {
        try {
            for (Integer element : arrayList) {
                System.out.print(element + " ");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }
}

