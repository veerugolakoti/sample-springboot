package threads;

public class ExecutionFrameworkExample implements Runnable {

    @Override
    public void run() {
            System.out.println("executer framework in java ");
        try {
            Thread.sleep(4000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
