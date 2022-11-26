package IT_Academy_Tutorial.examples.streams;

public class Phone2 {
    private String name;
    private String company;
    private int price;

    public Phone2(String name, String comp, int price){
        this.name=name;
        this.company=comp;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getCompany() { return company; }
}