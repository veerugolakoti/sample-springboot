package feature_ranjan.thread;

public class SynchronizedExample {
    public void synchronizedExam(String msg){
        System.out.println("sending :" + msg);
    try{
        Thread.sleep(1000);

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        System.out.println("msg sent :" +msg);
    }
}
