class MyThread implements  Runnable {
    public void run() {
        print();
    }

    public void print() {

        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.err.println(interruptedException);
            }
            System.out.println(i);
        }
    }
}
public class CreateThreadByRunnable {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread obj1 = new Thread(obj);
        obj1.start();


    }
}
