//        7
//        Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
//        строки из первого, но в обратном порядке (первая строка должна быть последней).

package Homework_from_Roman.hw5.exercise7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\Workstation\\" +
                            "IdeaProjects\\Homework\\src\\Homework_from_Roman\\" +
                            "hw5\\exercise7\\OUTPUT")))
        {
            List<String> lines = Files.readAllLines(Paths.get(
                    "C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5\\exercise7\\INPUT"));
            ListIterator li = lines.listIterator(lines.size());
            while(li.hasPrevious()) {
                bw.write((String)li.previous() + "\n");

            }
        }
        catch(IOException | NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }

}
