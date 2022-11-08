package Homework_from_Roman.hw5.exercise9_10;

import java.io.*;
import java.util.NoSuchElementException;

public class Mover {

    private Box[] boxes;

    public void serialise(String path) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(boxes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Box[] deSerialise(String path) {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            Box[] boxes = (Box[]) ois.readObject();
            this.boxes = boxes;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return boxes;
    }

    public void WriteBiggestVolume (String path) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
        {
            bw.write(getBoxes()[getBoxes().length-1].getVolume());
        } catch(IOException | NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Box[] getBoxes() {
        return boxes;
    }

}
