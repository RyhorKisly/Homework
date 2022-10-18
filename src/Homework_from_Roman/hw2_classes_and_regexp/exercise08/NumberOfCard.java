// Задача 8:
// Необходимо извлечь из строки и распечатать номер карты
// (XXXX-XXXX-XXXX-XXXX) если он там есть.

package Homework_from_Roman.hw2_classes_and_regexp.exercise08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCard {

    public static void findNumberOfCard(String str) {
        Pattern p = Pattern.compile("\\b\\d{4}[-]\\d{4}[-]\\d{4}[-]\\d{4}\\b");
        Matcher m = p.matcher(str);
        int i = 0;
        while (m.find()) {
            i++;
            System.out.println(m.group());
        }
        if (i == 0) {
            System.out.println("Нет номеров карт");
        }
    }

    public static void main(String[] args) {
        String str = "2345-6432-4527-9635 345-234-54-6564 dfhh fhft  sgsegs sgesg seg , 3452-3452-1423-5345, difj";
        findNumberOfCard(str);
    }

}
