package multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println("Hello World! "+t1.getState());

        t1.start();
        System.out.println("Hello! "+t1.getState());
        System.out.println(Thread.currentThread().getState());
        Thread.sleep(1000); // sleep for 1 second
        System.out.println("World! "+t1.getState());
        t1.join();
        System.out.println("--> "+t1.getState());


    }
}