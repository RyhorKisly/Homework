package IT_Academy_Tutorial.exercise32.eatHeatingDevices;

import IT_Academy_Tutorial.exercise32.Appliancable;

public abstract class EatHeatingDevices implements Appliancable {

    private String nameOfBrand;
    private int power;

    public abstract void plugIn();

    public abstract void increaseHeat();

}
