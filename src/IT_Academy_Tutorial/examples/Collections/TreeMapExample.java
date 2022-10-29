package IT_Academy_Tutorial.examples.Collections;


import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        // перебор элементов
        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        // получить набор всех значений
        Collection<String> values = states.values();

        // получаем все объекты, которые стоят после объекта с ключом 4
        Map<Integer, String> afterMap = states.tailMap(4);

        // получаем все объекты, которые стоят до объекта с ключом 10
        Map<Integer, String> beforeMap = states.headMap(10);

        // получим последний элемент дерева
        Map.Entry<Integer, String> lastItem = states.lastEntry();

        System.out.printf("Last item has key %d value %s \n",lastItem.getKey(), lastItem.getValue());

        TreeMap<String, Person> people = new TreeMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
    static class Person{

        private String name;
        public Person(String name){

            this.name = name;
        }
        String getName(){return name;}
    }

}

