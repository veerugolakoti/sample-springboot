package Multithreading;

public class Mythread1 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        try {
            int div = 30 / 0;
            System.out.println("divisible number is " + div);
        } catch (ArithmeticException e) {
            System.out.println("my exception");
        }
    }
}
