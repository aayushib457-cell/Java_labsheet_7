

import java.util.Random;

class Q5Thread extends Thread {

    public Q5Thread(String name) {
        super(name);
    }

    public void run() {
        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running");

            try {
                Thread.sleep(r.nextInt(501));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        Q5Thread t1 = new Q5Thread("Reader");
        Q5Thread t2 = new Q5Thread("Writer");
        Q5Thread t3 = new Q5Thread("Logger");

        t1.start();
        t2.start();
        t3.start();
    }
}
