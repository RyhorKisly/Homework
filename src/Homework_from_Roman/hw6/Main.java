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

package Homework_from_Roman.hw6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Factory store = new Factory();
        List<List <Robot>> army1 = new ArrayList<>();
        List<List <Robot>> army2 = new ArrayList<>();
        List<Robot> robot1 = new ArrayList<>();
        List<Robot> robot2 = new ArrayList<>();
        Country usa = new Country("USA", army1, robot1, store);
        Country northKorea = new Country("North Korea", army2, robot2, store);
        store.start();
        usa.start();
        northKorea.start();
        try {
            store.join();
            usa.join();
            northKorea.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
