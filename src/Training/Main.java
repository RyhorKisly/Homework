package Training;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Lamp first = new Lamp();
         Lamp first2 = first;

         Point p1 = new Point();
         Point p2 = new Point (15,6);

        HelloWorld h1 = new HelloWorld();
        h1.print();

        Integer intOb = new Integer(5);
        intOb = new Integer(15);
        System.out.println(intOb);

        Box box = new Box(2, 4, 6);
        box.printVolume();


        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.print("Height: ");
        float height = in.nextFloat();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height:" + height);
        in.close();


    }
}