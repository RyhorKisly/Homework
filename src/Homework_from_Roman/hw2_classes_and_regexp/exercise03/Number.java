//Задача 3:
//Необходимо создать класс который имеет метод чтобы накапливать 5 последних переданных
//в него цифровых значений. Так же необходимо создать метод который выводит
//среднее из накопленных значений.

package Homework_from_Roman.hw2_classes_and_regexp.exercise03;

public class Number {

    private final Integer[] array;
    private int index = 0;

    public Number(int count) {
        this.array = new Integer[count];
    }

    public void consume(int number) {
        array[index] = number;
        if (index == 4) {
            index = 0;
        } else {
            index++;
        }
    }

    public double avg() {
        double sum = 0;
        int count = 0;
        for (Integer j : array) {
            if (j != null) {
                sum += j;
                count++;
            }
        }
        System.out.println(sum / count);
        return sum / count;
    }

    public static void main(String[] args) {

        Number number = new Number(5);
        
        number.consume(10);


        number.avg();

    }

}
