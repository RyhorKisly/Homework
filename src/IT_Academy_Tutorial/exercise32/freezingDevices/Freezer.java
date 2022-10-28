package IT_Academy_Tutorial.exercise32.freezingDevices;

public class Freezer extends FreezingDevices {

    private String nameOfBrand;
    private int power;
    int count;

    public Freezer(String name, int power) {
        this.nameOfBrand = name;
        this.power = power;
    }

    public void plugIn() {
        System.out.println("Включить в разетку");
    };

    public void increaseFrost() {
        System.out.println("Увеличить уровень замораживания на: "  + count++);
        System.out.println("Уровень заморозки увеличен на: " + count);
    }

    public void switchOnDefrostFunction() {
        System.out.println("Включить функцию размораживания");
    }

}
