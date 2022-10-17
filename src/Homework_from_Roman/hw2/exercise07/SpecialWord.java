// Задача 7:
// Необходимо узнать есть ли в строке слова которые начинаются
// и заканчиваются на букву "а".

package Homework_from_Roman.hw2.exercise07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialWord {

        public static void findWordWithFirstAndLastLetterA(String str) {
            Pattern p = Pattern.compile("\\b[Аа][а-яА-Я]*[Аа]\\b");
            Matcher m = p.matcher(str);
            int i = 0;
            while (m.find()) {
                i++;
                    System.out.println(m.group());
            }
            if (i == 0) {
                System.out.println("Нет таких слов");
            }
        }

        public static void main(String[] args) {
            String str = "Аппетитна а была твоя еда. Особенно арбуз. Анкара, я съел там три абрикоса";
            findWordWithFirstAndLastLetterA(str);

        }


}
