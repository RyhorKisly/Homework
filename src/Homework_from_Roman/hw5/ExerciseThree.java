//        3
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. по команде "status" необходимо вывести введенные
//        цифры в отсортированном виде.

package Homework_from_Roman.hw5;

import java.util.*;

public class ExerciseThree {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        int number = 0;
        while(true) {
            if(in.hasNextInt()) {
                number = in.nextInt();
                arrayList.add(number);
                System.out.println(number);
            } else {
                if(in.next().equals("ESC")) {
                    break;
                }
                System.out.println("Введите целое число или stop слово: \"ESC\"");
            }
        }
        while(true) {
            if (in.nextLine().equals("status")) {
                Collections.sort(arrayList);
                break;
            } else {
                System.out.println("Введите слово \"status\"");
            }
        }
        in.close();

        for(Integer element : arrayList) {
            System.out.print(element + " ");
        }

    }
}

