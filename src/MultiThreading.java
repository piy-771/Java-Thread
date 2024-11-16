class MyThread1 implements  Runnable {
    public void run() {
        print();
    }

    public void print() {

        for (int i = 1; i <=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }

        }
    }
}

class MyThread2 implements  Runnable {
    public void run() {
        display();
    }

    public void display() {

        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException interruptedException){
                System.out.println(interruptedException);
            }
            System.out.println("I love java");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        Thread obj1 = new Thread(obj);
        obj1.start();
        MyThread2 obj2 = new MyThread2();
        Thread obj3 = new Thread(obj2);
        obj3.start();


    }
}
