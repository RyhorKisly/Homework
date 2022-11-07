//        5
//        Необходимо написать программу по умножению двух матриц.
//        Пользователь вводит матрицы с клавиатуры.

package Homework_from_Roman.hw5.exerciseFifeMultiplyMatrix;

public class Main {
    public static void main(String[] args) {



        MatrixMultiplier multiplier = new MatrixMultiplier();

        int[][] matrix1 = multiplier.getMatrixByScanner(new int[3][3]);
        multiplier.printMatrix(matrix1);

        int[][] matrix2 = multiplier.getMatrixByScanner(new int[3][3]);
        multiplier.printMatrix(matrix2);

        multiplier.setMultipliedMatrix(new int[3][3]);

        try {
            multiplier.getIn().close();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();
        multiplier.multiplyMatrix(matrix1, matrix2);
        System.out.println("Произведение двух матриц равно: ");
        multiplier.printMatrix(multiplier.getMultipliedMatrix());

    }
}
