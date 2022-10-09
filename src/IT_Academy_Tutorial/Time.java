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
    public static void main(String[] args) {

        Time dividedTime = new Time(7, 49, 53);
        Time onlySeconds = new Time();

        dividedTime.printFullTime();
        dividedTime.printFullSeconds();
        System.out.println();

    }

    private int sec;
    private int min;
    private int hour;

    public Time(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public Time() {
        int seconds = this.sec + (this.min * 60) + (this.hour * 3600);
    }

    public int fullSeconds() {
        int fullSeconds = this.sec + (this.min * 60) + (this.hour * 3600);
        return fullSeconds;
    }

    public void printFullSeconds() {
            System.out.println("Time: " + fullSeconds() + " sec;");
    }

    public void printFullTime() {
            System.out.println("Hours: " + this.hour + "; "
                    +  "Minutes: " + this.min + "; " + "Seconds: " + this.sec + ".");
    }

    //    public void compareTo() {
//        if (this.seconds1() > this.seconds2()) {
//            System.out.println("Time1 more then Time2");
//        } else if (this.seconds1() < this.seconds2()) {
//            System.out.println("Time1 less then Time2");
//        } else {
//            System.out.println("equal");
//        }
//    }

}

