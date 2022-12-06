//        Даны 2 файла - INPUT_1 и INPUT_2
//        в каждом файле по 1000 чисел от 1 до 100000.
//        Создайте файл OUTPUT, который будет содержать все отсортированные числа из файлов.
//        Файлы INPUT_1 и INPUT_2 можно создать с помощью кода.

package Homework_from_Roman.hw5_new;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[1000];
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5_new\\INPUT_1"))) {
            for(int element : numbers) {
                element = RANDOM.nextInt(100000) + 1;
                String str = element + "\n";
                bw.write(str);
            };
        } catch(IOException | NoSuchElementException | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5_new\\INPUT_2"))) {
            for(int element : numbers) {
                element = RANDOM.nextInt(100000) + 1;
                String str = element + "\n";
                bw.write(str);
            };
        } catch(IOException | NoSuchElementException | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }



        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5_new\\OUTPUT")))
        {
            List<Integer> list = new ArrayList<>();
                    Files.lines(Paths.get("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5_new\\INPUT_1"), StandardCharsets.UTF_8)
                    .forEach(i -> list.add(Integer.valueOf(i)));
            Files.lines(Paths.get("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5_new\\INPUT_2"), StandardCharsets.UTF_8)
                    .forEach(i -> list.add(Integer.valueOf(i)));
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
