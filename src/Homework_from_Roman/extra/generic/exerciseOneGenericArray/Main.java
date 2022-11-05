//        Написать класс, который умеет хранить в себе массив любых типов данных
//        (int, long etc.). Реализовать метод, который возвращает любой элемент
//        массива по индексу.

package Homework_from_Roman.extra.generic.exerciseOneGenericArray;

public class Main<T> {

    public static void main(String[] args) {

        Main main = new Main("Привет", 234, 23.3, (byte) 8, (long) 34);
        main.getArrayElementByIndex(2);
    }

    private T[] array;

    public Main(T... array) {
        this.array = array;
    }
    public void getArrayElementByIndex (int index) {
        try {
            if (index > array.length - 1){
                throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
            }
            System.out.println(array[index]);
        } catch(ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }
    }
}
