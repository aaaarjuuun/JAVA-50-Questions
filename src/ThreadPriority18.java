class MyTask extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " is running with Priority: " + Thread.currentThread().getPriority());
        }

    }
}

public class ThreadPriority18{
    public static void main(String[] args){

        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();

        t1.setName("Thread-1 (Normal)");
        t2.setName("Thread-2 (VIP)");

        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }

}