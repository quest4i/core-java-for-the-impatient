package ch04.sec01;

/**
 * Created on 2016. 9. 18. 오후 5:01.
 *
 * @author quest4i
 */
public class ConcurrentWorker extends Worker {

    public void work() {
        Thread t = new Thread(super::work);
        t.start();
    }
}
