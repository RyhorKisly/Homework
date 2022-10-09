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

        Time onlySeconds = new Time(234235, 235253235);
        Time dividedTime = new Time(25367);

        onlySeconds.printOnlySeconds();
        System.out.println();
        onlySeconds.compareTo();
        System.out.println();
        dividedTime.printFullTime();

    }

    private int sec1;
    private int sec2;
    private int sec3;
    private int min;
    private int hour;

    public Time(int sec1, int sec2) {
        this.sec1 = sec1;
        this.sec2 = sec2;
    }

    public Time(int sec3) {
        this.min = sec3 / 60;
        this.hour = this.min / 60;
        this.min %= 60;
        this.sec3 = sec3 % 60;
    }

    public int seconds1() {
        return this.sec1;
    }

    public int seconds2() {
        return this.sec2;
    }


    public void compareTo() {
        if (this.seconds1() > this.seconds2()) {
            System.out.println("Time1 more then Time2");
        } else if (this.seconds1() < this.seconds2()) {
            System.out.println("Time1 less then Time2");
        } else {
            System.out.println("equal");
        }
    }

    public void printOnlySeconds() {
            System.out.println("Time1 -  Seconds: " + this.sec1 + ";" +
                    "\n" + "Time2 -  Seconds: " + this.sec2 + ".");
    }

    public void printFullTime() {
            System.out.println("Time1 - Hours: " + this.hour + "; "
                    +  "Minutes: " + this.min + "; " + "Seconds: " + this.sec3 + ".");

    }

}

