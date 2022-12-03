package Homework_from_Roman.hw6;

public class MainNew{
    private static boolean aBoolean = true;

    public static void main(String[] args) {

        if(!aBoolean) {
            MethodOne();
        }

    }

    public static void MethodOne() {
        System.out.println("Метод один");
    }

    public static void methodTwo() {
        System.out.println("Метод два");
        aBoolean = false;
    }



    }


