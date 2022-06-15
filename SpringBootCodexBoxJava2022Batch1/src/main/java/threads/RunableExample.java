package threads;

public class RunableExample implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<=6;i++){
            System.out.println("print the count : " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("my thread is over ");
    }
}
