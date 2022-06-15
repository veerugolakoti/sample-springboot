package MultiThreadeing;

public class ThreadIsalive extends Thread{
    public static int count = 0;
    public static int count2 = 0;
    public void run() {
        count++;
        count2++;
    }
}
