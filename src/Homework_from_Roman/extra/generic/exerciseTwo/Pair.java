//        Реализовать класс Pair, который будет содержать 2 значения любого типа.
//        Класс умеет выводить:
//        * first() - возвращает 1ый элемент
//        * last() - возвращает 2ой элемент
//        * swap() - меняет элементы местами
//        * replaceFirst() - заменяет 1ый элемент на новый
//        * replaceLast() - заменяет 2ой элемент на новый

package Homework_from_Roman.extra.generic.exerciseTwo;

public class Pair<T> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

//        * first() - возвращает 1ый элемент
    public T first() {
        return first;
    }

//        * last() - возвращает 2ой элемент
    public T last() {
        return second;
    }

//        * replaceFirst() - заменяет 1ый элемент на новый
    public void replaceFirst(T first) {
        this.first = first;
    }

//        * replaceLast() - заменяет 2ой элемент на новый
    public void replaceLast(T second) {
        this.second = second;
    }

//        * swap() - меняет элементы местами
    public void swap(T first, T second) {
        this.first = second;
        this.second = first;
    }
}
