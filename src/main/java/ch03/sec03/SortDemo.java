package ch03.sec03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created on 2016. 9. 16. 오전 2:56.
 *
 * @author quest4i
 */
public class SortDemo {

    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));

        friends = new String[] { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }

}


class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
