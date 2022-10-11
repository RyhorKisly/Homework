package IT_Academy_Tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnamExample {

    public static void main(String[] args) {

        String name = "MONDAY";
        Day day = Day.valueOf(name);

        for (Day day2 : Day.values()) {
            System.out.println("Current day is " + day2);
        }




    }

    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

}


