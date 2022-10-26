package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        CarFactory carFactory = new CarFactory(Color.RED, Model.OCTAVIA, 2022,
                WheelSize.BIG, EngineVolume.BIG_VOLUME, new String[] {String.valueOf(OptionList.LEATHER_SEATS),
                String.valueOf(OptionList.AUTOMATIC_TRANSMISSION), null});

        System.out.println(Arrays.toString(carFactory.carStorage));

        CarShop carShop = new CarShop(service, carFactory);
        carShop.orderCar(Color.RED, Model.OCTAVIA, 2022,
                WheelSize.BIG, EngineVolume.BIG_VOLUME, new String[] {String.valueOf(OptionList.LEATHER_SEATS),
                        String.valueOf(OptionList.AUTOMATIC_TRANSMISSION), null});


    }
}
