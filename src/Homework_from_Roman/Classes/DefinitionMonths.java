package Homework_from_Roman.Classes;

import java.util.Arrays;

public class DefinitionMonths {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Months.values()));

        int januaryIndex = Months.JANUARY.ordinal();
        System.out.println(januaryIndex);

        Months month = Months.valueOf("1");
        System.out.println(month);

    }
}
