package IT_Academy_Tutorial.exercise32.eatHeatingDevices;

public class MicroWave extends EatHeatingDevices {

    private String nameOfBrand;
    private int power;
    int timeOfHeating;

    public MicroWave(String nameOfBrand, int power) {
        this.nameOfBrand = nameOfBrand;
        this.power = power;
    }

    public MicroWave(String name) {
        this.nameOfBrand = name;
    }

    public void plugIn() {
        System.out.println("Включить в разетку");
    };

    public void increaseHeat() {
        System.out.println("Увеличить мощность нагрева");
    };

    public void setTimeOfHeating(int timeOfHeating) {
        this.timeOfHeating = timeOfHeating;
        System.out.println("Установленное время нагрева: " + timeOfHeating);
    }
}
