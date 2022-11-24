package Homework_from_Roman.hw4.service;

import Homework_from_Roman.hw4.cars.Mercedes;
import Homework_from_Roman.hw4.enums.enumMercedes.WheelDrive;

public class ServiceWheelDrive implements Service{

    public void changeWheelDrive(Mercedes mercedes, WheelDrive wheelDrive) {
        try{
            if (mercedes != null && wheelDrive != null && !wheelDrive.equals(mercedes.getWheelDrive())) {
                mercedes.setWheelDrive(wheelDrive);
            }
        } catch (NullPointerException ex) {
            System.err.println(ex.getMessage());
        }
    }

}


