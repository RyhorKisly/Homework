package Homework_from_Roman.hw5.exercise8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Mover {

    List<String> lines;

    public List<String> readListFormInPut (String path) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            this.lines = lines;
        } catch(IOException | NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
        return lines;
    }

//        записать только те строки, которые есть и в первом, и во втором.
    public void writeReverseListToOutPut (String path, List<String> lines1, List<String> lines2) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String element1 : lines1) {
                for (String element2 : lines2) {
                    if (element1.equals(element2)) {
                        bw.write(element1 + "\n");
                    }
                }
            }
        } catch(IOException | NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }
}
