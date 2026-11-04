package multithreading;

class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class TestThread extends Thread{

   @Override
   public void run(){
      System.out.println("Call Thread");
      try{
         Thread.sleep(2000);
      }catch (InterruptedException e) {
         e.printStackTrace();
      }

   }
   public static void main(String args[]) throws InterruptedException {
      /* RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start(); */
      System.out.println("main thread " + Thread.currentThread().getState());

      TestThread  t1 = new TestThread();
      System.out.println(t1.getState()); // NEW
      t1.start();
      System.out.println(t1.getState()); // RUNNABLE
      try {
         Thread.sleep(100);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getState()); // main thread Running
      System.out.println(t1.getState()); // TIMED_WAITING
      t1.join();

      System.out.println(Thread.currentThread().getState()); // main thread Running
      System.out.println(t1.getState()); // TERMINATED
      

   }   
}