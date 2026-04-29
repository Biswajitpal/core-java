package multithreading;

public class Test {
    public static void main(String[] args) {
        // World w = new World();
        // w.start();
        // Thread t1 = new Thread(new World());
        // t1.start();

        // for(int i = 0; i < 10000; i++) {
        //     System.out.println("Hello " + i + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority()+"\n");
        // }
        // System.out.println("Hello World!");
        // System.out.println(Thread.currentThread().getName()); // main
        // System.out.println(Thread.currentThread().getPriority()); // 5

        // count threads call
        Counter c = new Counter();
        CounterThread t1 = new CounterThread(c);
        CounterThread t2 = new CounterThread(c);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }
        System.out.println("Counter: " + c.getCount() + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

    }
}
