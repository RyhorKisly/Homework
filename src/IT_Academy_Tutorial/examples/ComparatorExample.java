package IT_Academy_Tutorial.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {

    public static void main(String[] args) {


        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick",34));
        people.add(new Person("Tom",10));
        people.add(new Person("Bill",14));

        for(Person  p : people){

            System.out.println(p.getName() + " " + p.getAge());
        }
    }

    static class Person{

        private String name;
        private int age;
        public Person(String n, int a){

            name=n;
            age=a;
        }
        String getName(){return name;}
        int getAge(){return age;}
    }

    static class PersonNameComparator implements Comparator<Person> {

        public int compare(Person a, Person b){

            return a.getName().compareTo(b.getName());
        }
    }
    static class PersonAgeComparator implements Comparator<Person>{

        public int compare(Person a, Person b){

            if(a.getAge()> b.getAge())
                return 1;
            else if(a.getAge()< b.getAge())
                return -1;
            else
                return 0;
        }
    }

}
