package Homework_from_Roman.extra.inheritance.exerciseThreeAppliance.eatHeatingDevices;

public class Stove extends EatHeatingDevices {
    int stoveBurner;

    public Stove(String nameOfAppliance, Integer power, Double weight) {
        super(nameOfAppliance, power, weight);
    }

    public void chooseStoveBurner(int stoveBurner) {
        this.stoveBurner = stoveBurner;
        if(stoveBurner <= 4 && stoveBurner > 0) {
            System.out.println("Включить комфорку номер: " + stoveBurner);
        }
    }

    public int getStoveBurner() {
        return stoveBurner;
    }

    public void setStoveBurner(int stoveBurner) {
        this.stoveBurner = stoveBurner;
    }
}