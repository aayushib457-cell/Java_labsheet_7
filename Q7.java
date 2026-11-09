

class Q7Thread extends Thread {

    public void run() {
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}

public class Q7 {
    public static void main(String[] args) {

        Q7Thread t = new Q7Thread();

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread completed");
    }
}
