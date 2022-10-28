package IT_Academy_Tutorial.exercise34;

public class Boss extends Manager {
    private int salary;
    private int cashPerHour;

    public Boss(String name, String company, int percentageOfSales) {
        super(name, company, percentageOfSales);
    }

    public int salary(int gotMoneyForCompany, int workHours) {
        this.salary = (cashPerHour * workHours) + super.salary(gotMoneyForCompany);
        return salary;
    }

}
