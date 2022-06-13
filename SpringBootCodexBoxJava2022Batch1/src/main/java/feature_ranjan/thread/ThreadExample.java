package feature_ranjan.thread;

public class ThreadExample extends Thread {
    @Override
    public void run(){

        ThreadExample threadExample = new ThreadExample();
       // threadExample.start();
        System.out.println("get priority :"+threadExample.getPriority());
        System.out.println("current Thread id inside run() :" + threadExample.currentThread().getId());
        System.out.println("current Thread Name inside run() :" + threadExample.currentThread().getName()+"\n");
    }
   public void myThreadExample(){
       System.out.println("My own thread Id :"+currentThread().getId());
       System.out.println("My own thread Name :"+currentThread().getName()+"\n");
    }

}
