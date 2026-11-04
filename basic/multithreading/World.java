package multithreading;

public class World implements Runnable {
// public class World extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("World " + i + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }
    }
    
}
