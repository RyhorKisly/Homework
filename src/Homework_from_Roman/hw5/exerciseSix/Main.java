//        6
//        Задача #5, но матрицы необходимо считывать из файла (INPUT).

package Homework_from_Roman.hw5.exerciseSix;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
                try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5\\exerciseSix\\INPUT"), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
                    System.out.println(e.getMessage());;
        }
    }
}
