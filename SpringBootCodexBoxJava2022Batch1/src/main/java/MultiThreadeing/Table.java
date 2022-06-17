package MultiThreadeing;

public class Table {
    public void table(int i) {
        for(int j = 1; j <= 10; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(j*i);
        }
    }
}
