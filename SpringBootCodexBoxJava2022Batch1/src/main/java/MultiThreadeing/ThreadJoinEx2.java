package MultiThreadeing;

public class ThreadJoinEx2 extends Thread{
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
