package Homework_from_Roman.course.specialOptions;


import Homework_from_Roman.course.enums.enumMercedes.WheelDrive;

public class SpecialOptionsMercedes implements SpecialOptions{
    private WheelDrive wheelDrive;

    public SpecialOptionsMercedes(WheelDrive wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }
}
