
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Method 1 (Thread Class) printing: " + i);
            try {

                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}


class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Method 2 (Runnable Interface) printing: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

// MAIN CLASS
public class Thread17 {
    public static void main(String[] args) {
        System.out.println("--- Race Starts Now! ---");


        MyThread t1 = new MyThread();
        t1.start();


        MyRunnable task = new MyRunnable();
        Thread t2 = new Thread(task);
        t2.start();
    }
}