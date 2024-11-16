class  Task implements  Runnable{
    @Override
    public void run() {
        System.out.println("Hello User");
    }
}

public class ThreadType {
    public static void main(String[] args) {
        int priorityOfMainThread = Thread.currentThread().getPriority();

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("priorityOfMainThread = " + priorityOfMainThread);
        Task taskObject= new Task();
        Thread obj = new Thread(taskObject);
        obj.start();

        int priorityOfChildThread = obj.getPriority();
        System.out.println("priorityOfChildThread = " + priorityOfChildThread);


        int priorityOfMainThreadAfterSetPriority = Thread.currentThread().getPriority();
        System.out.println("priorityOfMainThreadAfterSetPriority = " + priorityOfMainThreadAfterSetPriority);


    }
}
