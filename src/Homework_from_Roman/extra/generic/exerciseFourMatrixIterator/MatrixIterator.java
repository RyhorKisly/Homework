package Homework_from_Roman.extra.generic.exerciseFourMatrixIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class  MatrixIterator<T> implements Iterator<T> {
    private int position = 0;  //номер текущего элемента для "выдачи"
    private int i = 0;
    private int j = 0;
    private T[][] matrix;

    public MatrixIterator(T[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return (position < (matrix[i].length * matrix.length));
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        while (i < matrix.length && j >= matrix[i].length) {
            j = 0;
            i++;
            System.out.println();
        }
        T element = matrix[i][j];  //запоминаем текущий элемент
        //переходим к следующему элементу
        position++;
        j++;

        return element;
    }


    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action);
    }
}