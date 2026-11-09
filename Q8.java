

class Q8Thread extends Thread {

    public Q8Thread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running");
    }
}

public class Q8 {
    public static void main(String[] args) {

        Q8Thread t1 = new Q8Thread("High Priority Thread");
        Q8Thread t2 = new Q8Thread("Low Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getName() + " Priority: " + t1.getPriority());

        System.out.println(t2.getName() + " Priority: " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
