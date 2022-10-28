package IT_Academy_Tutorial.exercise34;

public class Worker extends Person{

    private String company;
    private int cashPerHour;
    private int salary;

    public Worker(String name, String company) {
        super(name);
        this.company = company;
    }

    public int getSalary(int workHours) {
        this.salary = cashPerHour * workHours;
        return salary;
    }


}
