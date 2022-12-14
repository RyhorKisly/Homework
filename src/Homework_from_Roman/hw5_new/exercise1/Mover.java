package Homework_from_Roman.hw5_new.exercise1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Mover {

    private final static Random RANDOM = new Random();


    public void writeNumbers(String path, int lengthOfNumbers) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(int i = 0; i < lengthOfNumbers; i++) {
                String str = (RANDOM.nextInt(100000) + 1) + "\n";
                bw.write(str);
            };
        } catch(IOException | NoSuchElementException | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }

    public List<Integer> readNumbers(String path) {
        List<Integer> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(i -> list.add(Integer.valueOf(i)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void writeSortedNumber(String path, List<Integer> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
        {
            Collections.sort(list);
            for(int i = 0; i < list.size(); i++) {
                String str = list.get(i) + "\n";
                bw.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
