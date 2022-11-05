package IT_Academy_Tutorial.examples.exeptions;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class FirstApp {

    public static void main(String[] args) {

        try {
            int[] i = new int[3];
            i[3] = 3;
            System.out.println(i[3]);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
//        finally {                                      //можно не добавлять этот блок. Он всё равно выполнится
//            System.out.println("Блок finally");        //даже если исключения не было
//        }
        System.out.println("Программа завершена");


//        int[] numbers = new int[3];
//        try{
//            numbers[6]=45;
//            numbers[6]=Integer.parseInt("gfd");
//        }
//        catch(ArrayIndexOutOfBoundsException ex){
//
//            System.out.println("Выход за пределы массива");
//        }
//        catch(NumberFormatException ex){
//
//            System.out.println("Ошибка преобразования из строки в число");
//        }


//        try{
//            Scanner in = new Scanner(System.in);
//            int x = in.nextInt();
//            if(x >= 30) {
//                throw new Exception("Число х должно быть меньше 30");
//            }
//        }
//        catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Программа завершена");


//        try{
//            int result = getFactorial(-6);
//
//            System.out.println(result);
//        }
//        catch(Exception ex){
//
//            System.out.println(ex.getMessage());
//        }
//
//    }
//    public static int getFactorial(int num) throws Exception{
//
//        if(num<1) {
//            throw new Exception("The number is less than 1");
//        }
//        int result=1;
//        for(int i=1; i<=num;i++){
//
//            result*=i;
//        }
//        return result;

    }


}
