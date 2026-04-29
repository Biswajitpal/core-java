package multithreading;

public class BankAccount {
    private int balance = 100;
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        } else {
            balance -= amount;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + Thread.currentThread().getName());
            }
            System.out.println("Withdrawn: " + amount + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }
    }
}
