package Homework_from_Roman.hw2.exercise03;

public class Main {
    public static void main(String[] args) {

        int[] number = Number.createElementsOfArray(10);
        Number.printArrays(Number.array);
        System.out.println();
        Number.accumulate5LastElements(number);
        Number.printArrays(Number.arrayAccumulate);
        System.out.println();
        Number.averageArray(Number.arrayAccumulate);

    }
}
