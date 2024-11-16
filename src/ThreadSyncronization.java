class  MyThread4 implements Runnable{
    @Override
    public void run() {
       print();
    }
    void print(){
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException interruptedException){
                    System.err.println(interruptedException);
                }
            }
        }

    }
}

class  MyThread5 implements Runnable{
    @Override
    public void run() {
        print();
    }

    public synchronized void print(){
        for (int i = 0; i < 5; i++) {
            System.out.println("I love java");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException interruptedException){
                System.err.println(interruptedException);
            }
        }
    }
}

public class ThreadSyncronization {
    public static void main(String[] args) {
        MyThread4 obj = new MyThread4();
        Thread obj1 = new Thread(obj);
        obj1.setName("MyThread4 ");
        obj1.start();
        System.out.println(obj1.getName() + "started");

        MyThread5 obj2 = new MyThread5();
        Thread obj3 = new Thread(obj2);
        obj3.setName("MyThread5 ");
        obj3.start();
        System.out.println(obj3.getName() + "started");

    }

}
