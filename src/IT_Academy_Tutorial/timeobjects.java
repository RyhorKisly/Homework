package IT_Academy_Tutorial;

public class timeobjects {
    public static void main(String[] args) {

        Time onlySeconds = new Time(234235, 235253235);
        Time dividedTime = new Time(536877);

        onlySeconds.printOnlySeconds();
        System.out.println();
        onlySeconds.compareTo();
        System.out.println();
        dividedTime.printFullTime();

    }

}
