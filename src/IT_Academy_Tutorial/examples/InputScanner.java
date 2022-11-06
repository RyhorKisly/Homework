package IT_Academy_Tutorial.examples;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число пися: ");
        int num = scan.nextInt();

        System.out.println(num);

        scan.close();

    }
}
