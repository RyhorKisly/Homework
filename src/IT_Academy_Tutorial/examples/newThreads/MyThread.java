package IT_Academy_Tutorial.examples.newThreads;

class MyThread implements Runnable {

    MyThread(){
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("Loop " + counter++);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(" has been interrupted");

                break;  // выход из цикла
            }
    }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
}}