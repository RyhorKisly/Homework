package Homework_from_Roman.inheritance.exerciseOne;

public class Student extends Man {

    private int yearOfStudy;

    public Student(int yearOfStudy) {
        super();
        this.yearOfStudy = yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int increaseYearOfStudyOnOneYear() {
        yearOfStudy++;
        return yearOfStudy;
    }

}
