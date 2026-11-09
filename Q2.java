

class MyThread implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("My Name: Aayushi");
                Thread.sleep(200);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {

        MyThread obj = new MyThread();

        Thread t = new Thread(obj);

        t.start();
    }
}
