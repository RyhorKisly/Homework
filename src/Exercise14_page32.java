public class Exercise14_page32 {
    public static void main(String[] args) {

        long x = 7893823445l;
        long z = 0l;
        int sum = 0;
        if (x < 0) {
            System.out.println("Давай без этого, прошу)");
        } else {
        do {
            z = x % 10;
            sum += z;
            x /= 10;
        } while (x > 0);
        System.out.println("Answer: " + sum);
        }
    }
}
