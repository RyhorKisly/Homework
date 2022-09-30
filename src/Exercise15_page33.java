public class Exercise15_page33 {
    public static void main(String[] args) {

        boolean b = true;
        int x = 1;
        for (int p = 50; p <= 70; p++) {
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    b = false;
                    break;
                }
            } // for 2
            if (b) {
                if (x == 2) {                         // выводит второе значение
                    System.out.println(p);
                    break;
                }
                x++;
            } else {
                b = true;
            }
        } // for 1
    } // main
} // class