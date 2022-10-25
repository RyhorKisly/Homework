package Homework_from_Roman.hw3;

import Homework_from_Roman.hw3.componentsOfAuto.*;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        CarFactory carFactory = new CarFactory(service);

        CarShop carShop = new CarShop(service, carFactory);
        carShop.orderCar(Color.RED, Model.OCTAVIA, 2022,
                WheelSize.BIG, EngineVolume.BIG_VOLUME, OptionList.LEATHER_SEATS);

        service.addOption(carShop.orderCar(Color.RED, Model.OCTAVIA, 2022,
                WheelSize.BIG, EngineVolume.BIG_VOLUME, OptionList.LEATHER_SEATS), OptionList.AUTOMATIC_TRANSMISSION);




    }
}
