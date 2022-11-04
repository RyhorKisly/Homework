//        Парк общественного транспорта. Определить иерархию различных видов ОТ.
//        Создать парк ОТ. Рассчитать стоимость автопарка. Провести сортировку
//        машин парка по расходу топлива. Найти автобус в компании, соответствующий
//        заданному диапазону параметров.

        package Homework_from_Roman.extra.inheritance.exerciseFifePublicTransport;

public class Main {

        public static void main(String[] args) {


                AutoBus autoBus1 = new AutoBus("Автобус № 1", 17, 50000);
                AutoBus autoBus2 = new AutoBus("Автобус № 3", 25, 35000);
                AutoBus autoBus3 = new AutoBus("Автобус № 13", 32, 70000);
                AutoBus autoBus4 = new AutoBus("Автобус № 16", 20, 19000);
                MiniBus miniBus1 = new MiniBus("Маршрутка № 1081", 13, 19000);
                MiniBus miniBus2 = new MiniBus("Маршрутка № 1079", 15, 13000);
                MiniBus miniBus3 = new MiniBus("Маршрутка № 1101", 18, 23000);
                Taxi taxi1 = new Taxi("Такси - Лось", 6, 7000);
                Taxi taxi2 = new Taxi("Такси - Uber", 8, 11000);
                BusPark busPark = new BusPark(autoBus1, autoBus2, autoBus3, autoBus4,
                        miniBus1, miniBus2, miniBus3, taxi1, taxi2);

                busPark.costAutoPark();
                busPark.sortByFuelConsumption();
                System.out.println();
                busPark.findTransportCorrespondingToLoadCapacity(33211, 93001);

        }

}
