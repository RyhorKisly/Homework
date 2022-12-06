package Homework_from_Roman.hw4_new.specialOptions;


import Homework_from_Roman.hw4_new.enums.enumMercedes.WheelDrive;

public class SpecialOptionsMercedes implements SpecialOptions{
    private WheelDrive wheelDrive;

    public SpecialOptionsMercedes(WheelDrive wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }
}
