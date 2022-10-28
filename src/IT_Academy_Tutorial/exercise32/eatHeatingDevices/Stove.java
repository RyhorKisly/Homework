package IT_Academy_Tutorial.exercise32.eatHeatingDevices;

public class Stove extends EatHeatingDevices {

    String name;
    int stoveBurner;

    public Stove(String name) {
        this.name = name;
    }

    public void plugIn() {
        System.out.println("Включить в разетку");
    };

    public void increaseHeat() {
        System.out.println("Увеличить мощность нагрева");
    };

    public void chooseStoveBurner(int stoveBurner) {
        this.stoveBurner = stoveBurner;
        if(stoveBurner <= 4 && stoveBurner > 0) {
            System.out.println("Включить комфорку номер: " + stoveBurner);
        }
    }
}