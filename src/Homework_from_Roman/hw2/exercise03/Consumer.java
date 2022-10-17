package Homework_from_Roman.hw2.exercise03;

public class Consumer {

    private int consume;
    private int i = 0;
    private int sum;
    private double average;
    private int before1;
    private int before2;
    private int before3;
    private int before4;
    private int before5;

    public void consume(int number) {
        before5 = before4;
        before4 = before3;
        before3 = before2;
        before2 = before1;
        before1 = number;
        sum = before1 + before2 + before3 + before4 + before5;
        System.out.println(sum);
        i++;
    }

    public void avg() {
        if (i < 5) {
            average = (double)sum / i;
        } else {
            average = (double)sum / 5;
        }
        System.out.println(average);
    }

    public static void main(String[] args) {

        Consumer consumer = new Consumer();

        consumer.consume(1);
        consumer.consume(2);
        consumer.consume(3);
        consumer.consume(3);
        consumer.consume(3);
        consumer.consume(5);

        consumer.avg();

    }
}
