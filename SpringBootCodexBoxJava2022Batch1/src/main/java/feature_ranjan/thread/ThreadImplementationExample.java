package feature_ranjan.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadImplementationExample implements Runnable {
    private String name;

    public ThreadImplementationExample(String s){
        this.name = s;
    }
    @Override
    public void run() {
        try{
        for (int i=0;  i<5; i++) {
            if(i==0){
            Date d = new Date();
            SimpleDateFormat df = new SimpleDateFormat("ss");
            System.out.println("Initialization time for task :"+ name +"="+df.format(d));
        }
            else{
                Date d = new Date();
                SimpleDateFormat df = new SimpleDateFormat("ss");
                System.out.println("Execution time for task :"+ name +"="+df.format(d));
            }Thread.sleep(1000);
        }
            System.out.println(name+"completed");
        }catch(InterruptedException e){
            e.printStackTrace();
        }catch (IllegalArgumentException e2){
            e2.printStackTrace();
        }
    }
}
