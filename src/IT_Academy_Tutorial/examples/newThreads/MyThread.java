package IT_Academy_Tutorial.examples.newThreads;

class MyThread implements Runnable {

    MyThread(){
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("Loop " + counter++);


    }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
}}