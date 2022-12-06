//        Даны 2 файла - INPUT_1 и INPUT_2
//        в каждом файле по 1000 чисел от 1 до 100000.
//        Создайте файл OUTPUT, который будет содержать все отсортированные числа из файлов.
//        Файлы INPUT_1 и INPUT_2 можно создать с помощью кода.

package Homework_from_Roman.hw5_new.exercise1;

public class Main {

    private static final String INPUT_1 = "C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
            "Homework_from_Roman\\hw5_new\\exercise1\\INPUT_1";
    private static final String INPUT_2 = "C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
            "Homework_from_Roman\\hw5_new\\exercise1\\INPUT_2";
    private static final String OUTPUT = "C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
            "Homework_from_Roman\\hw5_new\\exercise1\\OUTPUT";


    public static void main(String[] args) {

        Mover mover = new Mover();
        mover.writeNumbers(INPUT_1, 1000);
        mover.writeNumbers(INPUT_2, 1000);
        mover.writeSortedNumber(OUTPUT, mover.readNumbers(INPUT_1, INPUT_2));

    }
}
