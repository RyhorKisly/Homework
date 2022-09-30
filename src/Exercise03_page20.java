// Задание: Написать код, который выведет значения переменных на экран

public class Exercise03_page20 {
    public static void main(String[] args) {

        byte b = 0x55;
        short s = 0x55ff;
        int i = 1_000_000;
        long I = 0xffffffffL;
        char c ='a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.println(b + "\n" + s + "\n" + i + "\n" + I + "\n" + c + "\n" + f + "\n" + d + "\n" + bool);
    }
}
