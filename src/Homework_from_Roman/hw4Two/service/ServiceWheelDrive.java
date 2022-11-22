package Homework_from_Roman.hw4Two.service;

import Homework_from_Roman.hw4Two.brand.Mercedes;
import Homework_from_Roman.hw4Two.brand.enums.enumMercedes.WheelDrive;

public class ServiceWheelDrive extends Service {

    WheelDrive wheelDrive;

    public void changeColor(Mercedes mercedes, WheelDrive wheelDrive) {
        if (mercedes != null && wheelDrive != null && !wheelDrive.equals(mercedes.getWheelDrive())) {
                mercedes.setWheelDrive(wheelDrive);

        }
    }

}
