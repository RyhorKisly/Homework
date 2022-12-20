package Homework_from_Roman;

public class Main
{
    public static void main(String[] args)
    {
        ChildClass obj = new ChildClass();
    }

    public static String print(String text)
    {
        System.out.println(text);
        return text;
    }
}

class ParentClass
{
    public String a = Main.print("ParentClass.a");
    public String b = Main.print("ParentClass.b");

    public ParentClass()
    {
        Main.print("ParentClass.constructor");
    }
}

class ChildClass extends ParentClass
{
    public String c = Main.print("ChildClass.c");
    public String d = Main.print("ChildClass.d");

    public ChildClass()
    {
        Main.print("ChildClass.constructor");
    }
}