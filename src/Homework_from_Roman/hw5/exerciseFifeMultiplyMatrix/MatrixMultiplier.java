package Homework_from_Roman.hw5.exerciseFifeMultiplyMatrix;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MatrixMultiplier {

    int[][] multipliedMatrix;
    private Scanner in = new Scanner(System.in);

    public int[][] getMatrixByScanner(int[][] matrix) {
        System.out.println("Введите числа для матрицы: ");
        try {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    while (true) {
                        if (in.hasNextInt()) {
                            matrix[i][j] = in.nextInt();
                            System.out.println(matrix[i][j] + " ");
                            break;
                        } else {
                            System.out.println("Введите число: ");
                            in.next();
                        }
                    }
                }
            }
        } catch (NoSuchElementException | IllegalStateException ex) {
        System.out.println(ex.getMessage());
    }
        return matrix;
    }

    public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        try {
            for (int i = 0; i < multipliedMatrix.length; i++) {
                for (int j = 0; j < multipliedMatrix[i].length; j++) {
                    multipliedMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException ex){
            System.err.println(ex.getMessage());
        }
            return multipliedMatrix;
    }

    public void printMatrix(int[][] matrix) {
        try {
            for (int[] subArray : matrix) {
                for (int element : subArray) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        } catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }
    }


    public int[][] getMultipliedMatrix() {
        return multipliedMatrix;
    }

    public Scanner getIn() {
        return in;
    }

    public void setMultipliedMatrix(int[][] multipliedMatrix) {
        this.multipliedMatrix = multipliedMatrix;
    }
}
