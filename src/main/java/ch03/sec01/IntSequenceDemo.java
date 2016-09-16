package ch03.sec01;

/**
 * Created on 2016. 9. 16. 오전 1:44.
 *
 * @author quest4i
 */
public class IntSequenceDemo {

    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }


    public static void main(String[] args) {

        SquareSequence square = new SquareSequence();
        double avg = average(square, 100);
        System.out.println("Average of first 100 squares: " + avg);

        IntSequence digits = new DigitSequence(1729);
        while (digits.hasNext()) {
            System.out.print(digits.next() + " ");
        }
        System.out.println();

        digits = new DigitSequence(1729);
        avg = average(digits, 100);
        System.out.println("Average of the digits: " + avg);
    }
}
