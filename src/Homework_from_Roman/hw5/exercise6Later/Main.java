//        6
//        Задача #5, но матрицы необходимо считывать из файла (INPUT).

package Homework_from_Roman.hw5.exercise6Later;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        List<String> arrayLines = new ArrayList<>();

                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5\\exerciseSix\\INPUT"), StandardCharsets.UTF_8))){
                    String line;

                    while ((line = reader.readLine()) != null) {
                        arrayLines.add(line);
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());;
                }


                        Pattern p = Pattern.compile("\\b(\\d)*\\b");
                        Matcher m = p.matcher(arrayLines.get(0));
                            for (int i = 0; m.find(); i++) {

        }


    }
}
