package IT_Academy_Tutorial.exercise34;

public class Manager extends Worker{

    private int percentageOfSales;
    private int salary;

    public Manager(String name, String company, int percentageOfSales) {
        super(name, company);
        this.percentageOfSales = percentageOfSales;
    }

    public int salary(int gotMoneyForCompany) {
        salary = gotMoneyForCompany / percentageOfSales;
        return salary;
    }

    public int getPercentageOfSales() {
        return percentageOfSales;
    }

    public void setPercentageOfSales(int percentageOfSales) {
        this.percentageOfSales = percentageOfSales;
    }
}
