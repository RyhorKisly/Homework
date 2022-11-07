package Homework_from_Roman.hw5.exerciseFifeMultiplyMatrix;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MatrixMultiplier {


    private int[][] matrix1;
    private int[][] matrix2;
    int[][] multipliedMatrix;
    private Scanner in = new Scanner(System.in);
        public int[][] chooseMatrix1() {
        System.out.println("Введите числа для первой матрицы: ");
        try {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    while (true) {
                        if (in.hasNextInt()) {
                            matrix1[i][j] = in.nextInt();
                            System.out.println(matrix1[i][j] + " ");
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
        return matrix1;
    }

    public int[][] chooseMatrix2() {
        System.out.println("Введите числа для второй матрицы: ");
        try {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    while (true) {
                        if (in.hasNextInt()) {
                            matrix2[i][j] = in.nextInt();
                            System.out.println(matrix2[i][j] + " ");
                            break;
                        } else {
                            System.out.println("Введите число: ");
                            in.next();
                        }
                    }
                }
            }
        } catch (NoSuchElementException |
                 IllegalStateException |
                 ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        return matrix2;
    }

    public int[][] multiplyMatrix() {
        try {
            for (int i = 0; i < multipliedMatrix.length; i++) {
                for (int j = 0; j < multipliedMatrix[i].length; j++) {
                    multipliedMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }
            return multipliedMatrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] subArray : matrix) {
            for (int element : subArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public int[][] getMultipliedMatrix() {
        return multipliedMatrix;
    }

    public Scanner getIn() {
        return in;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public void setMultipliedMatrix(int[][] multipliedMatrix) {
        this.multipliedMatrix = multipliedMatrix;
    }
}
