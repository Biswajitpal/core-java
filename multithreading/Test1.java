package multithreading;

public class Test1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        System.out.println("Thread ID: " + Thread.currentThread().threadId());
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }
       
    }

    public static void main(String[] args) throws InterruptedException {
        System.err.println("main state1 "+Thread.currentThread().getState());

        Test1 t1 = new Test1();
        System.out.println("State1 "+t1.getState());
        t1.start();
        System.out.println("State2 "+t1.getState());
        Thread.sleep(1000); // sleep for 1 second
        t1.interrupt();
        System.out.println("State3 "+t1.getState());
        System.err.println("main state2 "+Thread.currentThread().getState());
        Thread.sleep(1500);
        System.out.println("State4 "+t1.getState());
        // Thread mainThread = new Thread();
        // mainThread.join();
        System.err.println("main state3 "+Thread.currentThread().getState());

        
        /*
        System.out.println("Hello World!");
        Test1 obj1 = new Test1();
        System.out.println("state1: " + obj1.getState());
        obj1.start();
        System.out.println("state2: " + obj1.getState());
        // obj1.join();
        System.out.println("state3: " + obj1.getState());

        Test1 obj2 = new Test1();
        System.out.println("state1 obj2: " + obj1.getState());

        obj2.start();
        System.out.println("state2 obj2: " + obj1.getState());

        obj2.join();
        System.out.println("state3 obj2: " + obj1.getState());

        System.out.println("Thread ID: " + Thread.currentThread().threadId());
        */
        /*
        Thread startThread = new Thread(()-> {
           System.out.println("call thread");
           Test1 obj1 = new Test1();
           Test1 obj2 = new Test1();
           obj1.start();
           try{
            obj1.join();
           }catch(InterruptedException e){
            System.out.println("Thread interrupted: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
           }
           obj2.start();
           try{
            obj2.join();
           }catch(InterruptedException e){
            System.out.println("Thread interrupted: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
           }
           System.out.println("Other Thread ID: " + Thread.currentThread().threadId());
        });
        startThread.start();
        System.out.println("Main Thread ID: " + Thread.currentThread().threadId());
        */
    }
}