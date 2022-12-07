//        Дан файл INPUT.
//        Прочитать файл по строкам
//        Подсчитать количество символов 'a' в файле.
//        Заменить содержимое файлов на число символов 'a'.

package Homework_from_Roman.hw5_new.exercise2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        int amountOfCharA = 0;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
                                "Homework_from_Roman\\hw5_new\\exercise2\\INPUT"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for(int i = 0; i < line.length(); i++) {
                    if('a' == (line.charAt(i))) {
                            amountOfCharA++;
                        }
                }
            }
        } catch (IOException e) {
            // log error
        }
        System.out.println("Количекство символов 'a' в файле: " + amountOfCharA);




//          или вот такой вариант:




        int amountOfCharANew = 0;
        List<String> lines;
            try {
                lines = Files.readAllLines(Paths.get("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
                        "Homework_from_Roman\\hw5_new\\exercise2\\INPUT"));
                for(int i = 0; i < lines.size(); i++) {
                    for(int j = 0; j < lines.get(i).length(); j++) {
                        if('a' == (lines.get(i).charAt(j))) {
                            amountOfCharANew++;
                        }
                    }
                }
                System.out.println("Количекство символов 'a' в файле: " + amountOfCharANew);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }



    }





}
