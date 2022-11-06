//        1
//        Необходимо реализовать программу, которая будет считывать
//        строки, введенные пользователем и выводить их в консоль.

package Homework_from_Roman.hw5;

import java.io.*;
import java.util.Scanner;

public class exerciseOne {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//            while (true) {
//                if (scan.hasNextLine()) {
//                    System.out.println(scan.nextLine());
//                } else {
//                    break;
//                }
//            }
//            scan.close();


        try (BufferedReader br = new BufferedReader (new InputStreamReader(System.in))) {
            while(true){
                System.out.println(br.readLine());
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
