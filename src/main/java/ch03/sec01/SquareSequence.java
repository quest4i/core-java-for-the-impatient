package ch03.sec01;

/**
 * Created on 2016. 9. 16. 오전 1:46.
 *
 * @author quest4i
 */
public class SquareSequence implements IntSequence {

    private int i;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i * i;
    }
}
