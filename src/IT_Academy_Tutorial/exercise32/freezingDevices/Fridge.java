package IT_Academy_Tutorial.exercise32.freezingDevices;

public class Fridge extends FreezingDevices {

    String name;
    int count;

    public Fridge(String name) {
        this.name = name;
    }

    public void plugIn() {
        System.out.println("Включить в разетку");
    };

    public void increaseFrost() {
        System.out.println("Увеличить уровень замораживания на: "  + count++);
        System.out.println("Уровень заморозки увеличен на: " + count);
    }

}
