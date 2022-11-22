package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.brand.Mercedes;
import Homework_from_Roman.hw4.brand.enums.enumMercedes.WheelDrive;

public class ServiceWheelDrive extends Service{

    WheelDrive wheelDrive;

    public void changeColor(Mercedes mercedes, WheelDrive wheelDrive) {
        if (mercedes != null && wheelDrive != null && !wheelDrive.equals(mercedes.getWheelDrive())) {
                mercedes.setWheelDrive(wheelDrive);

        }
    }

}
