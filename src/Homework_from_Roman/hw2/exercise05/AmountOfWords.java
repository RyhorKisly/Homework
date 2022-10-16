// Задача 5:
// Необходимо посчитать колличество слов в строке в которых буква
// "с" встречается 3 и более раз.

package Homework_from_Roman.hw2.exercise05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmountOfWords {

    public static void findAmountOfWordsWithThreeLetterC(String str) {
        Pattern p = Pattern.compile("[Сс]([а-рт-яА-РТ-Я]*)[Сс]([а-рт-яА-РТ-Я]*)[Сс]([а-рт-яА-РТ-Я]*)");
        Matcher m = p.matcher(str);
        int i;
        for (i = 0; m.find(); i++) {
            System.out.println(m.group());
        }
        System.out.println("Количество слов с тремя буквами \"с\": " + i);
    }

    public static void main(String[] args) {
        String str = "Стресс ссс ссс встречается у встревоженных сосисок. Самый сложный сленг стиснулся.";
        findAmountOfWordsWithThreeLetterC(str);

    }



}
