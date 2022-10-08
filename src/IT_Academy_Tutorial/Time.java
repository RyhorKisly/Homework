//Создать класс описывающий промежуток времени. Сам промежуток в классе
//должен задаваться тремя свойствами: секундами, минутами, часами. Сделать
//методы для получения количества секунд в объекте, сравнения двух
//объектов (метод должен работать аналагично compareTo в строках). Создать два
//конструктора:
//        - получающий общее количество секунд
//        - получающий часы, минуты и секунды по отдельности.
//    Сделать метод для вывода данных. Прочее на ваше усмотрение.

package IT_Academy_Tutorial;

public class Time {
    private int sec;
    private int s;
    private int min;
    private int m;
    private int h;
    final String NAME = "Time";



    public Time(int sec) {
        this.sec = sec;
        this.s = sec % 60;
        this.min = (sec - s) / 60;
        this.m = min % 60;
        this.h = (min - m) / 60;
    }

    public void printSeconds() {
        System.out.println(sec + " секунд");
    }

    public void printFullTime() {
        System.out.println(h + " часа " + m + " минут " + s + " секунд ");
    }

}

class Compare {
    int x;
    int y;

    public Compare(int x, int y) {
        this.x = x;
        this.y = y;
        if (x > y) {
            System.out.println("Время 1 больше времени 2");
        } else if (x < y) {
            System.out.println("Время 2 больше времени 1");
        } else {
            System.out.println("Промежутки времени равны");
        }
    }

}

