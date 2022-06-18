package MultiThreadeing;

public class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println("Thread id: " + Thread.currentThread().getId());
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
