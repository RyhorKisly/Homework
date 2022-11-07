//        4
//        Необходимо реализовать программу "калькулятор".
//        Поддерживаемые операции +-/* выбор операции и ввод данных
//        осуществляется пользователем с клавиатуры.

package Homework_from_Roman.hw5.exercise4Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int num1 = calculator.getNumber();
        calculator.chooseOperation();
        int num2 = calculator.getNumber();
        calculator.calc(num1, num2, calculator.getOperation());
        try {
            calculator.getIn().close();
        } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }

        System.out.println("Результат операции: " + calculator.getResult());



    }

}
