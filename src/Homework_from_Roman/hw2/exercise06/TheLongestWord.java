// Задача 6:
// Необходимо найти самое длинное слово в строке.

package Homework_from_Roman.hw2.exercise06;

public class TheLongestWord {

    public static void findTheLongestWord(String str) {
        String[] words = str.split("\\s*(\\s|,|!|:|;|\\?|\\.)\\s*");              //Как указать для разделения
        String longestWord = "";                                                       //все символы, кроме букв???
        for (String word : words) {
            if (longestWord.length() < word.length()) {
                longestWord = word;

            }
        }
        System.out.println(longestWord);
    }

    public static void main(String[] args) {

        String str = "Даже брать вариант кабинет леры, он не плохой. Нооченьиоченьмаленький";
        findTheLongestWord(str);

    }
}

