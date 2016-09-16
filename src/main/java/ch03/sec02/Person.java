package ch03.sec02;

/**
 * Created on 2016. 9. 16. 오전 1:50.
 *
 * @author quest4i
 */
public interface Person {

    String getName();

    default int getId() {
        return 0;
    }
}
