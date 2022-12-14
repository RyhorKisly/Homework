package IT_Academy_Tutorial.examples.newThreads;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        Thread one = new Thread(() -> myThread.run(), "MyThread");
        one.start();
                try{
            one.sleep(1000);

            one.interrupt();

            one.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }

        System.out.println("Main thread finished...");

    }
}
