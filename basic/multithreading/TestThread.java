package multithreading;

public class TestThread extends Thread {
    TestThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + "\n" + i);
            Thread.yield();
        }
        // try {
        //     Thread.sleep(2000);
        //     System.out.println("Thread is running: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

        // } catch (InterruptedException e) {
        //     System.out.println("Thread interrupted: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        // }
    }
    public static void main(String[] args) throws InterruptedException {
        // Thread t1 = new Thread();
        Thread low = new TestThread("Low");
        low.setPriority(MIN_PRIORITY);
        Thread medium = new TestThread("Medium");
        medium.setPriority(NORM_PRIORITY);
        Thread high = new TestThread("High");
        high.setPriority(MAX_PRIORITY);
        low.start();
        medium.start();
        // high.start();

        // t1.join();
        // low.interrupt();
    }
}
// start run sleep yield join interrupt setDaemon