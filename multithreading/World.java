package multithreading;

class Text extends Thread {
    @Override
    public void run() {
        // for (; ;) {
            System.out.println(Thread.currentThread().getName() + ": Hello from the Text thread!");
        // }
    }
}

class Test implements Runnable {
    @Override
    public void run() {
        for (; ;) {
            System.out.println(Thread.currentThread().getName() + ": Hello from the Test thread!");
        }
    }
}
public class World extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Hello from the World thread!");
    }
    public static void main(String[] args) {
        World world = new World();
        // Thread worldThread = new Thread(world::run);
        world.start();
        Text worldThread = new Text();
        worldThread.start();
        // Test test = new Test();
        // Thread testThread = new Thread(test);
        // testThread.start();
        System.out.println("Hello from the main thread!");
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        
    }
}