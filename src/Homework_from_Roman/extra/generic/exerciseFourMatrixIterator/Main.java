//      Написать итератор по двумерному массиву

        package Homework_from_Roman.extra.generic.exerciseFourMatrixIterator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[][] array = {{1, 3, 5, 7, 9, 1}, {3, 5, 7, 9, 1, 3}};

        MatrixIterator<Integer> matrixIterator = new MatrixIterator<>(array);
        System.out.println();
        while(matrixIterator.hasNext()) {
            System.out.print(matrixIterator.next() + " ");
        }



    }

}
