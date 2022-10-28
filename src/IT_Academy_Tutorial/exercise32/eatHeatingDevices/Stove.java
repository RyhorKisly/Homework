package IT_Academy_Tutorial.exercise32.eatHeatingDevices;

public class Stove extends EatHeatingDevices {

    private String nameOfBrand;
    private int power;
    int stoveBurner;

    public Stove(String nameOfBrand, int power) {
        this.nameOfBrand = nameOfBrand;
        this.power = power;
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