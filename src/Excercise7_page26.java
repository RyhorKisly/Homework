public class Excercise7_page26 {
    public static void main(String[] args) {

        int a = 6;
        int b = 17;
        int r = 10;

        if (a <= 0 || b <= 0 || r<=0) {
            System.out.println("Not in this world)");
        } else if ((a * a) + (b * b) > (r * r)) {
            System.out.println("You can't cover this rectangle");
        } else {
            System.out.println("You can cover this rectangle");
        }

    }
}
