package Homework_from_Roman.hw5.exerciseFourCalculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.chooseFirstNumber();
        calculator.chooseSecondNumber();
        calculator.chooseOperation();
        calculator.calc(calculator.getNum1(), calculator.getNum2(), calculator.getOperation());
        calculator.getIn().close();

        System.out.println("Результат операции: " + calculator.getResult());



    }

}
