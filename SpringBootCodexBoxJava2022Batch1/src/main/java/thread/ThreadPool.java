package thread;

public class ThreadPool implements Runnable {

    private String studentName;





    @Override
    public void run() {
       for (int i = 0; i<=4;i++){
            int a = 80;
            int b = 70;
            int sum = a+b;
            System.out.println("the sum of two numbers :"+studentName +"  "+sum);


        }

    }
}
