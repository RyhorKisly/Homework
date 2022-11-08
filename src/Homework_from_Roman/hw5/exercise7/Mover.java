package Homework_from_Roman.hw5.exercise7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Mover {

    private List<String> lines;

    public void readListFormInPut (String path) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            this.lines = lines;
        } catch(IOException | NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void writeReverseListToOutPut (String path) {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
            {
        ListIterator li = lines.listIterator(lines.size());
        while(li.hasPrevious()) {
            bw.write((String)li.previous() + "\n");
        }
    } catch(IOException | NoSuchElementException ex){
        System.out.println(ex.getMessage());
    }
}

}
