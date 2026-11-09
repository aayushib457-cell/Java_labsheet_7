

class Q9Thread extends Thread {

    public Q9Thread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(
            getName() + " is running with priority " 
            + getPriority()
        );
    }
}

public class Q9 {
    public static void main(String[] args) {

        Q9Thread t1 = new Q9Thread("Thread 1");
        Q9Thread t2 = new Q9Thread("Thread 2");
        Q9Thread t3 = new Q9Thread("Thread 3");
        Q9Thread t4 = new Q9Thread("Thread 4");
        Q9Thread t5 = new Q9Thread("Thread 5");

        t1.setPriority(1);
        t2.setPriority(3);
        t3.setPriority(5);
        t4.setPriority(7);
        t5.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
