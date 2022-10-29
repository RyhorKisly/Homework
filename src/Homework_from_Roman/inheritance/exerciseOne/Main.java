// Создать класс Man (человек), с полями: имя, возраст, пол и вес.
// Определить методы задания имени, возраста и веса.
// Cоздать производный класс Student, имеющий поле года обучения.
// Определить методы задания и увеличения года обучения.

package Homework_from_Roman.inheritance.exerciseOne;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(2022);
        student.setName("Gregory");
        student.setAge(29);
        student.setWeight(93.5);
        System.out.println(student.increaseYearOfStudyOnOneYear());
        System.out.println(student.increaseYearOfStudyOnOneYear());
    }

}
