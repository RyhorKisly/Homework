package IT_Academy_Tutorial.examples.Collections;

import java.util.HashSet;                            // Не соблюдает последовательность при добавлении
                                                     // Также есть LinkedHashSet, который делает тоже что и HashSet,
                                                     // но выводит значения по порядку внесения в Set

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // пытаемя добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded + "\n"); // false

        System.out.println("Размер HashList: " + states.size() + "\n");

        for(String state : states) {
            System.out.println(state);
        }
        System.out.println();

        // удаление элемента
        states.remove("Germany");

        //хеш-таблица объектов Person
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Mike"));
        people.add(new Person("Kirill"));
        people.add(new Person("Gregory"));
        people.add(new Person("Polina"));
        for(Person p : people) {
            System.out.println(p.getName());

        }

    }

    static class Person {
        private String name;

        public Person(String value) {
            this.name = value;
        }
        String getName() {
            return name;
        }
    }

}
