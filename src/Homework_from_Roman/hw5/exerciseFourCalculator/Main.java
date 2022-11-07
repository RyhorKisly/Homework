//        4
//        Необходимо реализовать программу "калькулятор".
//        Поддерживаемые операции +-/* выбор операции и ввод данных
//        осуществляется пользователем с клавиатуры.

package Homework_from_Roman.hw5.exerciseFourCalculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.chooseFirstNumber();
        calculator.chooseOperation();
        calculator.chooseSecondNumber();
        calculator.calc(calculator.getNum1(), calculator.getNum2(), calculator.getOperation());

        try {
            calculator.getIn().close();
        } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }

        System.out.println("Результат операции: " + calculator.getResult());



    }

}
