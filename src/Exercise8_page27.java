public class Exercise8_page27 {
    public static void main(String[] args) {

        int x = -269;
        int y = x % 10;
        if (y == 1) {
            System.out.println("x = " + x + " рубль");
        } else if (y >= 2 && y <= 4) {
            System.out.println("x = " + x + " рубля");
        } else {
            System.out.println("x = " + x + " рублей");
        }
    }
}
