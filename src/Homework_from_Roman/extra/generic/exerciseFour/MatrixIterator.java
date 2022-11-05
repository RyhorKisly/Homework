package Homework_from_Roman.extra.generic.exerciseFour;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class  MatrixIterator<T> implements Iterator<T> {
    private int size;          //всего элементов в матрице
    private int position = 0;  //номер текущего элемента для "выдачи"
    private int i = 0;       //строка текущего элемента
    private int j = 0;       //столбец текущего элемента
    private T[][] matrix;

    public MatrixIterator(T[][] matrix) {
        this.matrix = matrix;
        this.size = countElements(matrix);
    }

    private int countElements(T[][] matrix) {  //считаем количество элементов в матрице
        int count = 0;
        for (T[] row : matrix) {
            count += row.length;
        }
        return count;
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public T next() {
        if (position >= size) { //если перебрали все элементы, то бросить исключение
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


}