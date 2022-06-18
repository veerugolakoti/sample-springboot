package MultiThreadeing;

public class MyThreadExample extends Thread{
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getId() + " <=> " + Thread.currentThread().getName() + " is running");
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());
    }
}
