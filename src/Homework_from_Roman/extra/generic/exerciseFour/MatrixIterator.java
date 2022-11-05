package Homework_from_Roman.extra.generic.exerciseFour;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class  MatrixIterator<T> implements Iterator<T> {
    private int size;          //всего элементов в матрице
    private int position = 0;  //номер текущего элемента для "выдачи"
    private int row = 0;       //строка текущего элемента
    private int col = 0;       //столбец текущего элемента
    private T[][] matrix;

    public MatrixIterator(T[][] matrix) {
        this.matrix = matrix;
        this.size = countElements(matrix);
    }

    public int countElements(T[][] matrix) {  //считаем количество элементов в матрице
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
        T element = matrix[row][col];  //запоминаем текущий элемент
        //переходим к следующему элементу
        position++;
        col++;
        while (row < matrix.length && col >= matrix[row].length) { //для того, чтоб пропустить возможные "пустые" строки
            col = 0;
            row++;
        }
        return element;
    }
}