package feature_ranjan.thread;

public class ThreadExample extends Thread {
    @Override
    public void run(){


       // threadExample.start();

        System.out.println("current Thread id inside run() :" + Thread.currentThread().getId());
        System.out.println("current Thread Name inside run() 5 :" + Thread.currentThread().getName()+"\n");
    }
   public void myThreadExample(){
       System.out.println("My own thread Id :"+currentThread().getId());
       System.out.println("My own thread Name :"+currentThread().getName()+"\n");
    }

}
