//        9
//        Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
//
//        10
//        Десериализовать объекты из задания #9. Отсортировать их по объёму.
//        Вывести на экран. Записать в файл (OUTPUT) самый большой объем.

package Homework_from_Roman.hw5.exercise9_10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(4, 5, 6);
        Box box3 = new Box(7, 8, 9);
        Box box4 = new Box(10, 11, 12);
        Box box5 = new Box(13, 14, 15);
        List<Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5\\exercise9_10\\INPUT");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(boxes);
        oos.close();

        ArrayList<Box> newBoxes= new ArrayList<>();
        FileInputStream fis = new FileInputStream("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5\\exercise9_10\\INPUT");
        ObjectInputStream ois = new ObjectInputStream(fis);

        newBoxes = ((ArrayList<Box>)ois.readObject());


        //осталось Отсортировать их по объёму. Вывести на экран. Записать в файл (OUTPUT) самый большой объем.

    }



}
