package Homework_from_Roman.hw5.exerciseFourCalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator<T> {

    private Scanner in = new Scanner(System.in);
    private int num;
    private char operation;
    private double result;

    public int getNumber() {
        try {
            System.out.println("Введите число: ");
            while (true) {
                if (in.hasNextInt()) {
                    num = in.nextInt();
                    break;
                } else {
                    System.out.println("Постарайтесь лучше: ");
                    in.next();
                }
            }
        } catch (NoSuchElementException | IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }
        return num;
    }

    public char chooseOperation() {
        System.out.println("Выберите операцию \"+-/*\": ");
        try {
            while (true) {
                if (in.hasNext()) {
                        operation = in.next().charAt(0);
                        break;
                } else {
                    System.out.println("Постарайтесь лучше: ");
                    in.next();
                }
            }
        } catch (NoSuchElementException | IllegalStateException | IndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage());
        }
        return operation;
    }

    public double calc(int num1, int num2, char operation){
        try {
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = (double) num1 / (double) num2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, chooseOperation());
            }
        } catch (ArithmeticException ex) {
            System.err.println(ex.getMessage());

        }
        return result;
    }

    public double getResult() {
        return result;
    }

    public char getOperation() {
        return operation;
    }

    public Scanner getIn() {
        return in;
    }
}
