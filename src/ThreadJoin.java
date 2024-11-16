class Thread6 implements Runnable{
    @Override
    public void run() {
        print();
    }
    public void  print(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException interruptedException){
                System.err.println(interruptedException);
            }

        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Thread6 obj = new Thread6();
        Thread obj1 = new Thread(obj);
        obj1.start();
        try{
            obj1.join();
        }
        catch (InterruptedException interruptedException){
            System.err.println(interruptedException);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("I love java");
        }

    }
}
