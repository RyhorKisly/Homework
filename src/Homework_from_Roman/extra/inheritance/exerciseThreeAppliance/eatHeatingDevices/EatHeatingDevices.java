package Homework_from_Roman.extra.inheritance.exerciseThreeAppliance.eatHeatingDevices;

import Homework_from_Roman.extra.inheritance.exerciseThreeAppliance.Appliance;

public class EatHeatingDevices extends Appliance {

    int timeOfHeating;

    public EatHeatingDevices(String nameOfAppliance, Integer power, Double weight) {
        super(nameOfAppliance, power, weight);
    }

    public void setTimeOfHeating(int timeOfHeating) {
        this.timeOfHeating = timeOfHeating;
        System.out.println("Установленное время нагрева: " + timeOfHeating);
    }

    public int getTimeOfHeating() {
        return timeOfHeating;
    }
}
