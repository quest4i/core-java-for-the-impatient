package ch03.sec02;

/**
 * Created on 2016. 9. 16. 오전 1:51.
 *
 * @author quest4i
 */
public interface IntSequence {

    default boolean hasNext() {
        return true;
    }

    int next();

}
