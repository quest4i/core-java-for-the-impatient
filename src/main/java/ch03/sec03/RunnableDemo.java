package ch03.sec03;

/**
 * Created on 2016. 9. 16. 오전 2:54.
 *
 * @author quest4i
 */
public class RunnableDemo {

    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Thread started");
    }

}


class HelloTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello, World!");
        }
    }
}
