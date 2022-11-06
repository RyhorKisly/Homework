//        1
//        Необходимо реализовать программу, которая будет считывать
//        строки, введенные пользователем и выводить их в консоль.

package Homework_from_Roman.hw5.exerciseOne;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExerciseOne {

    private Scanner scan = new Scanner(System.in);
    private BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    public void getStringByScanner() {
        try {
            System.out.println("Введите что-нибудь: ");
            while (true) {
                if (scan.hasNextLine()) {
                    System.out.println(scan.nextLine());
                } else {
                    break;
                }
            }
        } catch (NoSuchElementException | IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                scan.close();
            } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public void getStringByBufferedReader() {
        System.out.println("Введите что-нибудь: ");
        try {
            while(true){
                System.out.println(br.readLine());
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
