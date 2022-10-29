package IT_Academy_Tutorial.examples.Collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));
        System.out.println(people.get(2) + "\n");

        people.set(1, "Robert");

        System.out.println(people.get(1));
        System.out.println(people.get(2) + "\n");

        System.out.println("ArrayList has " + people.size() +  " elements\n");

        for(String person : people) {
            System.out.println(person);
        }
        System.out.println();

        if(people.contains("Tom")){
            System.out.println("ArrayList contains Tom\n");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }

    }

}
