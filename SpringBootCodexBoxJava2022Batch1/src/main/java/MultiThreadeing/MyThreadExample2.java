package MultiThreadeing;

public class MyThreadExample2 extends Thread{
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
            System.out.println("Priority: " + Thread.currentThread().getPriority());
        }
        System.out.println(Thread.currentThread().getName());
    }
}
