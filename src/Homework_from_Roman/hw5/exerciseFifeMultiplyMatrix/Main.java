package Homework_from_Roman.hw5.exerciseFifeMultiplyMatrix;

public class Main {
    public static void main(String[] args) {



        MatrixMultiplier multiplier = new MatrixMultiplier();

        multiplier.setMatrix1(new int[3][3]);
        multiplier.setMatrix2(new int[3][3]);
        multiplier.setMultipliedMatrix(new int[3][3]);

        multiplier.chooseMatrix1();
        multiplier.printMatrix(multiplier.getMatrix1());

        multiplier.chooseMatrix2();
        multiplier.printMatrix(multiplier.getMatrix2());

        System.out.println();
        multiplier.multiplyMatrix();
        System.out.println("Произведение двух матриц равно: ");
        multiplier.printMatrix(multiplier.getMultipliedMatrix());

    }
}
