// Задача 9:
// Реализовать программу которая проверит содержит ли строка некое слово, и если да то
// напечатает индекс первого символа данного слова.

package Homework_from_Roman.hw2.exercise09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstIndexOfTheSpecialWord {

    public static void findSpecialWord(String str, String searchWord) {
        Pattern p = Pattern.compile(searchWord);
        Matcher m = p.matcher(str);
        int i = 0;
        while (m.find()) {
            System.out.println("Индекс первой буквы искомого слова: " + m.start());
            i++;
        }
        if (i == 0) {
            System.out.println("Нет искомого слова");
        }
    }

    public static void main(String[] args) {

        String str = "Каждая капля дождя была такая огромная, что я чуть не утонул";
        findSpecialWord(str, "капля");

    }

}
