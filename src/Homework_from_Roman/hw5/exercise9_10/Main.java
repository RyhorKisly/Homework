//        9
//        Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
//
//        10
//        Десериализовать объекты из задания #9. Отсортировать их по объёму.
//        Вывести на экран. Записать в файл (OUTPUT) самый большой объем.

package Homework_from_Roman.hw5.exercise9_10;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Box box3 = new Box(1, 2, 3);
        Box box2 = new Box(4, 5, 6);
        Box box1 = new Box(7, 8, 9);
        Box box5 = new Box(10, 11, 12);
        Box box4 = new Box(13, 14, 15);
        Box[] boxes = new Box[5];
        boxes[0] = box3;
        boxes[1] = box2;
        boxes[2] = box1;
        boxes[3] = box5;
        boxes[4] = box4;


        FileOutputStream fos = new FileOutputStream("C:\\Users\\Workstation\\IdeaProjects\\" +
                "Homework\\src\\Homework_from_Roman\\hw5\\exercise9_10\\INPUT");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(boxes);
        oos.close();


        FileInputStream fis = new FileInputStream("C:\\Users\\Workstation\\IdeaProjects\\" +
                "Homework\\src\\Homework_from_Roman\\hw5\\exercise9_10\\INPUT");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Box[] newBoxes = (Box[]) ois.readObject();
        Arrays.sort(newBoxes);
        for(Box element : newBoxes) {
            System.out.println(element);
        }


        BufferedWriter br = null;
        try{
            br = new BufferedWriter(new FileWriter(new File("C:\\Users\\Workstation\\IdeaProjects\\" +
                    "Homework\\src\\Homework_from_Roman\\hw5\\exercise9_10\\OUTPUT")));
            br.write(newBoxes[newBoxes.length-1].getVolume());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Workstation\\IdeaProjects\\" +
                "Homework\\src\\Homework_from_Roman\\hw5\\exercise9_10\\OUTPUT")))
        {
            bw.write(newBoxes[newBoxes.length-1].getVolume());
        } catch(IOException | NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }

    }



}
