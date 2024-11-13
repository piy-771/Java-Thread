import java.util.TreeMap;

class myThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Thread Started");
        print();
    }

    //Add Task
    public void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            //for delay execution of program
            try {
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){
                System.out.println("interruptedException = " + interruptedException);
            }

        }
    }
}

public class CreateChildThread {

    public static void main(String[] args) {
        myThread obj = new myThread();
        obj.start();


    }
}
