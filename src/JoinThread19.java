class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + "is excuting: " + i);
            try{
                Thread.sleep(500);
            }catch(Exception exception){

            }
        }

    }
}
public class JoinThread19 {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t1.setName("Thread-1 ");
        t2.setName("Thread-2 ");

        t1.start();

        try{
            t1.join();

        }catch (InterruptedException exception){
            System.out.println(exception);
        }

        t2.start();
    }
}
