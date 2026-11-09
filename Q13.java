

class Buffer {

    int data;
    boolean available = false;

    synchronized void produce(int value) {

        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        data = value;
        available = true;

        System.out.println("Produced: " + value);

        notifyAll();
    }

    synchronized void consume() {

        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Consumed: " + data);

        available = false;

        notifyAll();
    }
}

public class Q13 {
    public static void main(String[] args) {

        Buffer b = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                b.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                b.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
