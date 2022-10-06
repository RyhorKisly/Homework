/* Задание: Задать промежуток времени в секундах в виде переменной.
Следует вывести его на экран в виде часов минут и секунд, суток и недель. */

package IT_Academy_Tutorial;
public class Exercise05_page20 {
    public static void main(String[] args) {
        int sec = 1295435;
        int s = sec % 60;            //35
        int min = (sec -s) / 60;     //21590
        int m = min % 60;            //50
        int hours = (min - m) / 60;  //359
        int h = hours % 24;          //23
        int d = (hours - h) / 24;  //14
        System.out.println(d + " дней " + h + " часа " + m + " минут " + s + " секунд ");
    }
}
