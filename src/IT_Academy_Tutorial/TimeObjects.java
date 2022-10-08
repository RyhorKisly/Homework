package IT_Academy_Tutorial;

public class TimeObjects {
    public static void main(String[] args) {

        Time time1 = new Time(23453);
        Time time2 = new Time(235234);

        time1.printSeconds();
        time1.printFullTime();

        System.out.println();

        time2.printSeconds();
        time2.printFullTime();

        System.out.println();

        Compare compare = new Compare(23453, 235234);



    }
}

