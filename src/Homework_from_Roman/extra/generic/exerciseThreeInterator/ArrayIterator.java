//      Написать итератор по массиву (посмотрите interface Iterator).
//        Ваш класс должен содержать 2 метода - hasNext() и next()

package Homework_from_Roman.extra.generic.exerciseThreeInterator;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    public static void main(String[] args) {

        Integer[] array = {1, 3, 5, 7, 9, 11};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(array);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private T array[];
    private int i = 0;

    public ArrayIterator(T anArray[]) {
        array = anArray;
    }

    public boolean hasNext() {
        return i < array.length;
    }

    public T next() {
            return array[i++];
    }

}
