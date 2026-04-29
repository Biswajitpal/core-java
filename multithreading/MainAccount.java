package multithreading;

public class MainAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                    // account.deposit(100);
                account.withdraw(75);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
        // Account account = new Account(1000);
        // Thread t1 = new Thread(new WithdrawTask(account, 700), "Thread 1");
        // Thread t2 = new Thread(new WithdrawTask(account, 800), "Thread 2");
        
        // t1.start();
        // t2.start();
        
        // try {
        //     t1.join();
        //     t2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        
        // System.out.println("Final balance: " + account.getBalance());
    }
}
