package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.models.enums.Option;
import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Option> opt1 = new HashSet<>();
        Set<Option> opt2 = new HashSet<>();
        opt1.add(Option.WINDSHIELD_HEATING);
        opt1.add(Option.AUTOMATIC_TRANSMISSION);
        opt2.add(Option.LEATHER_SEATS);
        opt2.add(Option.WINDSHIELD_HEATING);

        if(opt1.equals(opt2)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
//    public static void main(String[] args) {
//
//        Service service = new Service();
//        CarFactory carFactory = new CarFactory(Color.RED, Model.OCTAVIA, 2022,
//                WheelSize.BIG, EngineVolume.BIG_VOLUME, new String[] {String.valueOf(Option.LEATHER_SEATS),
//                String.valueOf(Option.AUTOMATIC_TRANSMISSION), null});
//
//        System.out.println(Arrays.toString(carFactory.carStorage));
//
//        CarShop carShop = new CarShop(service, carFactory);
//        carShop.orderCar(Color.RED, Model.OCTAVIA, 2022,
//                WheelSize.BIG, EngineVolume.BIG_VOLUME, new String[] {String.valueOf(Option.LEATHER_SEATS),
//                        String.valueOf(Option.AUTOMATIC_TRANSMISSION), null});
//
//
//    }
}
