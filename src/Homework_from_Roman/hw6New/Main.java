//        Есть две страны (Можно больше).
//        Они создают армии роботов чтобы напасть друг на друга.
//
//        Робот состоит из 6 честей:
//        1) руки(левая, правая);
//        2) ноги(левая, правая);
//        3) тело;
//        4) голова;
//
//        Есть нейтральный завод. Который производит одну случайную часть
//        в какую-то единицу времени, например рас в 5 секунд.
//
//        Соответственно эти страны пытаются взять с завода нужные им части
//        для составления  робота (лишние не брать, то что не забрали хранится
//        на заводе).
//
//        Кто первый соберёт армию из 20 роботов тот и победил.
//        О чем должно быть написано в консоль.
//
//
//        Программа должна корректно завершиться.

package Homework_from_Roman.hw6New;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Factory storage = new Factory();
        Country usa = new Country(storage, "USA");
        Country northKorea = new Country(storage, "NorthKorea");
        Country russia = new Country(storage, "Russia");
        Country kazahstan = new Country(storage, "Kazahstan");
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable factory = (storage::factorySetRobotParts);
        Runnable usaThread = (usa::getArmy);
        Runnable northKoreaThread = (northKorea::getArmy);
        Runnable russiaThread = (russia::getArmy);
        Runnable kazahstanThread = (kazahstan::getArmy);
        executorService.execute(factory);
        executorService.execute(usaThread);
        executorService.execute(northKoreaThread);
        executorService.execute(russiaThread);
        executorService.execute(kazahstanThread);
    }

}
