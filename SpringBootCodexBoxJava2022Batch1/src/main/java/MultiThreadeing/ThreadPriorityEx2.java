package MultiThreadeing;

public class ThreadPriorityEx2 extends Thread{

    public void run() {
        addition();
        multiplication();
        substraction();
    }
    public static void addition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition: " + c);
    }
    public  void multiplication() {
        int x = 10;
        int y = 20;
        int z = x * y;
        System.out.println("Multiplication: " + z);
    }
    public  void substraction() {
        int q = 45;
        int w = 12;
        int sub = q - w;
        System.out.println("Substraction: " + sub);
    }
}
