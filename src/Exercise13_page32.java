public class Exercise13_page32 {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 1;
        do {
            x *= y;
            y++;
            z++;
        } while (z <= 9);
        System.out.println("Факторила целых чисел от 0 до 10 равен:" + x);
    }
}
