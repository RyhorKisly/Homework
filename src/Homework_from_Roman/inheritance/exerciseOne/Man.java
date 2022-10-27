// Создать класс Man (человек), с полями: имя, возраст, пол и вес.
// Определить методы задания имени, возраста и веса.
// Cоздать производный класс Student, имеющий поле года обучения.
// Определить методы задания и увеличения года обучения.


        package Homework_from_Roman.inheritance.exerciseOne;

public class Man {

    private String name;
    private int age;
    private String sex;
    private double weight;


    public Man(String name, int age, String sex, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
