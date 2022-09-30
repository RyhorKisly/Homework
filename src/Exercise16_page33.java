public class Exercise16_page33 {
    public static void main(String[] args) {

        for (int x = 1, y = 1; x >= 1 && x <= 100; x++) {
            if (x % 7 == 0) {
                System.out.println(y + ": " + x + " = \"Hope!\"");
                y++;
            }
        }
    }
}
