//Создать класс описывающие Банкоматю Набор купюр, нахожящихся в
//банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
//50, 100. Сделать методы для добавления денег в банкомат. Сделать метод,
//снимающий деньги. С клавиатуры передаётся сумма денег. На экран - булевское
//значение (операция удалась или нет). При снятии денег метод должен выводить на
//экран каким количеством купюр и какого номинала выдается сумма. Создать
//конструктор с тремя параметрами - количеством купюр. Прочее - на ваше
//усмотрение.

package IT_Academy_Tutorial;
import java.util.Scanner;

public class Atm {
    private int note20;
    private int note50;
    private int note100;

    public Atm(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    public int getNote20() {
        return this.note20;
    }

    public void setNote20(int note20) {
        this.note20 = note20;
    }

    public int getNote50() {
        return this.note50;
    }

    public void setNote50(int note50) {
        this.note50 = note50;
    }

    public int getNote100() {
        return this.note100;
    }

    public void setNote100(int note100) {
        this.note100 = note100;
    }


    public void withdraw() {
        Scanner in = new Scanner(System.in);
        int x20 = 0;
        int x50 = 0;
        int x100 = 0;
        int cash = in.nextInt();
        //        System.out.println();
        if (cash % 10 == 0 && cash != 10 && cash != 30) {
            boolean b = true;
            System.out.println(b);
            System.out.println();
            for (int i = 0; i < this.note100 && i < cash / 100; i++) {
                i =
            }
        }

    }
}
