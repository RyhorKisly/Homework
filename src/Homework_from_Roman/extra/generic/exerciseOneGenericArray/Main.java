//        Написать класс, который умеет хранить в себе массив любых типов данных
//        (int, long etc.). Реализовать метод, который возвращает любой элемент
//        массива по индексу.

package Homework_from_Roman.extra.generic.exerciseOneGenericArray;

public class Main<T> {

    public static void main(String[] args) {

        Main main = new Main("Привет", 234, 23.3, (byte) 8, (long) 34);
        main.getArrayElementByIndex(5);
    }

    private T[] array;

    public Main(T... array) {
        this.array = array;
    }

    public T getArrayElementByIndex (int index) {
        try {
            System.out.println(array[index]);
            return array[index];
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
            return array[index];
        }
    }

}
