class Counter1 {
    int count = 0;

    public synchronized void increment(){
        count++;
    }
}
public class Concurrency20 {
    public  static void main(String[] args) throws Exception{
        Counter1 c = new Counter1();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++){
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count is: " + c.count);
    }
}
