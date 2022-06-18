package feature_ranjan.thread;

public class SynchExample2 extends Thread {
    String msg;
    SynchronizedExample sender;
    public SynchExample2(String m, SynchronizedExample obj){
        this.msg = m;
        this.sender = obj;
    }
    public void run(){
        synchronized (sender){
            sender.synchronizedExam(msg);
        }
    }
}
