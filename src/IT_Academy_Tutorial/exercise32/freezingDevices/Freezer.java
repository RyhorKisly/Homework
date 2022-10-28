package IT_Academy_Tutorial.exercise32.freezingDevices;

public class Freezer extends FreezingDevices {

    String name;
    int count;

    public Freezer(String name) {
        this.name = name;
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
