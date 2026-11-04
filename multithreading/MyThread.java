package multithreading;

public class MyThread extends Thread {
    MyThread( String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getState() + "  ---  " + Thread.currentThread().getPriority());
            try{
                Thread.sleep(1000);

            }catch(Exception e){

            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        //LOW
        MyThread obj1 = new MyThread("My-thread");
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        // mid
        MyThread obj2 = new MyThread("My-thread");
        obj2.setPriority(4);
        obj2.start();
        //High
        MyThread obj3 = new MyThread("My-thread");
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj3.start();

    }
}
