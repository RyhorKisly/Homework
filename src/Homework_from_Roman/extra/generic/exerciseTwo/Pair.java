//        Реализовать класс Pair, который будет содержать 2 значения любого типа.
//        Класс умеет выводить:
//        * first() - возвращает 1ый элемент
//        * last() - возвращает 2ой элемент
//        * swap() - меняет элементы местами
//        * replaceFirst() - заменяет 1ый элемент на новый
//        * replaceLast() - заменяет 2ой элемент на новый

package Homework_from_Roman.extra.generic.exerciseTwo;

public class Pair<T, S> {

    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

//        * first() - возвращает 1ый элемент
    public T getFirst() {
        return first;
    }

//        * last() - возвращает 2ой элемент
    public S getSecond() {
        return second;
    }

//        * replaceFirst() - заменяет 1ый элемент на новый
    public void setFirst(T first) {
        this.first = first;
    }

//        * replaceLast() - заменяет 2ой элемент на новый
    public void setSecond(S second) {
        this.second = second;
    }

//        * swap() - меняет элементы местами                           ???
    public void swapFirstAndSecond() {

    }
}
