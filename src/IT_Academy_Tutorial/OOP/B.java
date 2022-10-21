package IT_Academy_Tutorial.OOP;

public class B extends A{
    private int x;
    B() {
        super(1);
        this.x = 0;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.x);
        System.out.println(b.y);

    }

}
