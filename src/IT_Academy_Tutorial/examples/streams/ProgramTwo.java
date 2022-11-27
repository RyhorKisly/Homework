package IT_Academy_Tutorial.examples.streams;

class JThread extends Thread {

    JThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s staarted... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

public class ProgramTwo {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
    }
}