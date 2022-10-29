package IT_Academy_Tutorial.examples;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for (String state : states) {

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if (states.contains("Germany")) {

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        LinkedList<PersonTwo> people = new LinkedList<PersonTwo>();
        people.add(new PersonTwo("Mike"));
        people.addFirst(new PersonTwo("Tom"));
        people.addLast(new PersonTwo("Nick"));
        people.remove(1); // удаление второго элемента

        for (PersonTwo p : people) {

            System.out.println(p.getName());
        }
        PersonTwo first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }

    static class PersonTwo {

        private String name;

        public PersonTwo(String value) {

            name = value;
        }

        String getName() {
            return name;
        }
    }
}

