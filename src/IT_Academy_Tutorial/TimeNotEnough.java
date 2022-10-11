//Создать класс описывающий промежуток времени. Сам промежуток в классе
//должен задаваться тремя свойствами: секундами, минутами, часами. Сделать
//методы для получения количества секунд в объекте, сравнения двух
//объектов (метод должен работать аналагично compareTo в строках). Создать два
//конструктора:
//        - получающий общее количество секунд
//        - получающий часы, минуты и секунды по отдельности.
//    Сделать метод для вывода данных. Прочее на ваше усмотрение.
// стр. 48 упр. 24

package IT_Academy_Tutorial;

public class TimeNotEnough {
    public static void main(String[] args) {

        TimeNotEnough time1 = new TimeNotEnough(7, 49, 53);
        TimeNotEnough time2 = new TimeNotEnough(45684);

        time1.printTime();
        time2.printTime();

    }

    private int sec;
    private int min;
    private int hour;

    public TimeNotEnough(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public TimeNotEnough(int sec) {
        this.sec = sec % 60;
        this.min = sec / 60;
        this.hour = this.min / 60;
        this.min = sec % 60;
    }

    public void printTime() {
        System.out.println("Hours: " + this.hour + "; "
                +  "Minutes: " + this.min + "; " + "Seconds: " + this.sec + ".");
    }

}

