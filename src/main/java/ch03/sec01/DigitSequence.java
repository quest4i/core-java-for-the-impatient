package ch03.sec01;

/**
 * Created on 2016. 9. 16. 오전 1:42.
 *
 * @author quest4i
 */
public class DigitSequence implements IntSequence {

    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    @Override
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest() {
        return number;
    }
}
