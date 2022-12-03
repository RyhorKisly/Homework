package Homework_from_Roman.hw6;

public class MainNew{
    private static boolean aBoolean = true;

    public static void main(String[] args) {

        MethodOne();

    }

    public static void MethodOne() {
        if(aBoolean) {
        System.out.println("Метод один");
        }
    }

    public static void methodTwo() {
        System.out.println("Метод два");
        aBoolean = false;
    }



    }


