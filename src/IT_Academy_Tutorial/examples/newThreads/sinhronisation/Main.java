package IT_Academy_Tutorial.examples.newThreads.sinhronisation;

public class Main {
    public static void main(String[] args) {

        CommonResource commonResource= new CommonResource();
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread "+ i);
            t.start();
        }

    }
}
