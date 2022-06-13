package thread;

public class ThreadExamples extends Thread{
    public void threadMethods(){
        System.out.println("current thread name :"+currentThread().getName());
        System.out.println("current thread id :"+currentThread().getId());



    }
    @Override
    public void run(){

        System.out.println("run the method");


    }
}
