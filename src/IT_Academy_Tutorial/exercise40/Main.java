package IT_Academy_Tutorial.exercise40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static final Random RANDOM = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(RANDOM.nextInt(10));
            if (Collections.frequency(list, list.get(i)) > 1) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list.toString());
    }
}
