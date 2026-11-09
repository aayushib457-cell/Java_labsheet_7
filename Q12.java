
class BankAccount {

    int balance = 1000;

    private final Object lock = new Object();

    void withdraw(int amount) {

        synchronized (lock) {

            if (balance >= amount) {

                System.out.println(
                    Thread.currentThread().getName()
                    + " is withdrawing " + amount
                );

                balance = balance - amount;

                System.out.println("Withdrawal successful");

            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

public class Q12 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "User 1");

        Thread t2 = new Thread(() -> account.withdraw(700), "User 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + account.balance);
    }
}
