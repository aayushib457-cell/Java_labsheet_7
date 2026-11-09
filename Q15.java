

public class Q15 {

    static final Object Lock1 = new Object();
    static final Object Lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            synchronized (Lock1) {

                System.out.println("Thread 1: Holding Lock 1");

                synchronized (Lock2) {

                    System.out.println("Thread 1: Holding Lock 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (Lock1) {

                System.out.println("Thread 2: Holding Lock 1");

                synchronized (Lock2) {

                    System.out.println("Thread 2: Holding Lock 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
