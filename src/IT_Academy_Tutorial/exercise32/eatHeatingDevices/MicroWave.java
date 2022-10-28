package IT_Academy_Tutorial.exercise32.eatHeatingDevices;

public class MicroWave extends EatHeatingDevices {

    String name;
    int timeOfHeating;

    public MicroWave(String name) {
        this.name = name;
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
