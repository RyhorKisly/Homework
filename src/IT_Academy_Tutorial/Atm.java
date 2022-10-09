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

    public static void main(String[] args) {

        Atm atm = new Atm (54, 21, 23);
        atm.withdraw();
        System.out.println();
        atm.printAfterWithdraw();

    }

    private int note20;
    private int note50;
    private int note100;

    public Atm(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    public void withdraw() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму для снятия средств: ");
        boolean b = true;
        int i100;
        int i50;
        int i20;
        int cash = in.nextInt();

        if (cash % 10 == 0 && cash != 30 && cash >= 20) {
            System.out.println(b);
            System.out.println();

            for (i100 = 0; cash >= 100 && cash != 110 && cash != 130 && cash != 160 && this.note100 > 0; i100++) {
                this.note100--;
                cash -= 100;
            }
            System.out.println("Количество выданных купюр по 100р.: " + i100);

            for (i50 = 0; cash >= 50 && this.note50 > 0 && cash != 80 && cash != 60; i50++) {
                this.note50--;
                cash -= 50;
            }
            System.out.println("Количество выданных купюр по 50р.: " + i50);

            for (i20 = 0; 0 < cash && this.note20 > 0; i20++) {
                this.note20--;
                cash -= 20;
            }
            System.out.println("Количество выданных купюр по 20р.: " + i20);
        } else if (cash < 20) {
            System.out.println(b = false);
            System.out.println("Введена недостаточная сумма для вывода средств");
        } else if (cash % 10 != 0) {
            System.out.println(b = false);
            System.out.println("Введена некорректная сумма. Введите сумму кратную 20");
        }
    }
        public void printAfterWithdraw() {
            System.out.println("В банкомате осталось следующее количество купюр:\n"
                    + "по 100р.: " + this.note100 + ";\n"
                    + "по 50р.: " + this.note50 + ";\n"
                    + "по 20р.: " + this.note20 + ".");
        }

}




