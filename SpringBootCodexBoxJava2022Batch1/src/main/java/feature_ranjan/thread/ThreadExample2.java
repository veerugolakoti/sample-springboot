package feature_ranjan.thread;

public class ThreadExample2 extends Thread {
    private int i = 10;

    @Override
    public void run() {
        int a = 4;
        int b = 4;

        System.out.println("State of Thread :" + Thread.currentThread().getState());
        System.out.println("Id of Thread :" + Thread.currentThread().getId());
        System.out.println("Name of Thread :" + Thread.currentThread().getName());
    }

    synchronized public void threadEx2(int j) {
        for (int a = 0; a < j; a++) {
            if (i == 0) {


                System.out.println(a - 1 + "no gone " + i + "remaining no");
                System.out.println("Invoking wait() :");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("continue :");
            }
            i--;
        }
        System.out.println("counting completed");
    }
    synchronized public void notifyExample(){
        System.out.println("using notify :");
        i += 10;
        notify();
    }

}
