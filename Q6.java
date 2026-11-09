

class Q6Thread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q6 {
    public static void main(String[] args) {

        Q6Thread t = new Q6Thread();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("During execution: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After completion: " + t.isAlive());
    }
}
