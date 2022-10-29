package IT_Academy_Tutorial.examples;

import java.util.*;                           //В порядке возрастания сортирует

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");

        System.out.println(states.first()); // получим первый - самый меньший элемент
        System.out.println(states.last()); // получим последний - самый больший элемент
        // получим поднабор от одного элемента до другого
        SortedSet<String> set = states.subSet("Germany", "Italy");
        System.out.println(set);
        // элемент из набора, который больше текущего
        String greater = states.higher("Germany");
        System.out.println(greater);
        // элемент из набора, который меньше текущего
        String lower = states.lower("Germany");
        System.out.println(lower);
        // возвращаем набор в обратном порядке
        NavigableSet<String> navSet = states.descendingSet();
        // возвращаем набор в котором все элементы меньше текущего
        SortedSet<String> setLower=states.headSet("Germany");
        // возвращаем набор в котором все элементы больше текущего
        SortedSet<String> setGreater=states.tailSet("Germany");
        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);
        System.out.println();

        System.out.printf("TreeSet contains %d elements \n", states.size());
        // удаление элемента
        states.remove("Germany");
        for(String state : states){
            System.out.println(state);
        }

    }



}
