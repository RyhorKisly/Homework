package Homework_from_Roman.extra.generic.exerciseFour;

public class Main {
    public static void main(String[] args) {

        Integer[][] array = {{1, 3, 5, 7, 9, 11}, {13, 15, 17, 19, 21, 23}};

        MatrixIterator<Integer> matrixIterator = new MatrixIterator<>(array);
        System.out.println();
        while(matrixIterator.hasNext()) {
            System.out.print(matrixIterator.next() + " ");
        }

    }

}
