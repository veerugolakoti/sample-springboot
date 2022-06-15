package feature_ranjan.thread;

public class SynchronizeEx {
    synchronized public void synchExamJT(int n){
        for (int i=0; i<5; i++){
            System.out.println(i*n);
            try{
                Thread.sleep(1400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
