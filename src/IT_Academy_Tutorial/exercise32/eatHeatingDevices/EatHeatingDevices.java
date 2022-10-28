package IT_Academy_Tutorial.exercise32.eatHeatingDevices;

import IT_Academy_Tutorial.exercise32.Appliancable;

public abstract class EatHeatingDevices implements Appliancable {

    String name;

    public abstract void plugIn();

    public abstract void increaseHeat();

}
