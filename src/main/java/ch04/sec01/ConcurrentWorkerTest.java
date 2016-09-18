package ch04.sec01;

/**
 * Created on 2016. 9. 18. 오후 5:03.
 *
 * @author quest4i
 */
public class ConcurrentWorkerTest {
    public static void main(String[] args) {
        ConcurrentWorker worker = new ConcurrentWorker();
        worker.work();
        System.out.println("Done");
    }
}
