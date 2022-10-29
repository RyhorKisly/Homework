package Homework_from_Roman.inheritance.exerciseThree.freezingDevices;

import Homework_from_Roman.inheritance.exerciseThree.Appliance;

public class FreezingDevices extends Appliance {

    private int powerOfFreezing;

    public FreezingDevices(String nameOfAppliance, Integer power, Double weight) {
        super(nameOfAppliance, power, weight);
    }

    public int getPowerOfFreezing() {
        return powerOfFreezing;
    }

    public void setPowerOfFreezing(int powerOfFreezing) {
        this.powerOfFreezing = powerOfFreezing;
    }
}
