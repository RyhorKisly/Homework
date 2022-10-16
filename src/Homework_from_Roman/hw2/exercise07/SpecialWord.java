// Задача 7:
// Необходимо узнать есть ли в строке слова которые начинаются
// и заканчиваются на букву "а".

package Homework_from_Roman.hw2.exercise07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialWord {

        public static void findWordWithFirstAndLastLetterA(String str) {
            Pattern p = Pattern.compile("\\b[Аа][а-яА-Я]+[Аа]\\b");
            Matcher m = p.matcher(str);
            int i;
            for (i = 0; m.find(); i++) {
                System.out.println(m.group());
            }
            System.out.println("Количество слов с тремя буквами \"с\": " + i);
        }

        public static void main(String[] args) {
            String str = "Аппетитна была твоя еда. Особенно арбуз. Анкара, я съел там три абрикоса";
            findWordWithFirstAndLastLetterA(str);

        }


}
