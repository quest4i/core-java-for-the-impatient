package ch03.sec02;

/**
 * Created on 2016. 9. 16. 오전 1:52.
 *
 * @author quest4i
 */
public interface Identified {

    default int getId() {
        return Math.abs(hashCode());
    }

}
