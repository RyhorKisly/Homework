//        7
//        Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
//        строки из первого, но в обратном порядке (первая строка должна быть последней).

package Homework_from_Roman.hw5.exercise7;

public class Main {
    public static void main(String[] args) {

        Mover mover = new Mover();
        mover.readListFormInPut(
                "C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5\\exercise7\\INPUT");
        mover.writeReverseListToOutPut(
                "C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\Homework_from_Roman\\hw5\\exercise7\\OUTPUT");

    }
}
