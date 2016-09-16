package ch03.sec04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created on 2016. 9. 16. 오전 3:06.
 *
 * @author quest4i
 */
public class LambdaDemo {

    public static void main(String[] args) {

        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends,
                (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(friends));

        ArrayList<String> enemies =
                new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
//        enemies.removeIf(e -> e == null);
        enemies.removeIf(e -> Objects.isNull(e));
        System.out.println(enemies);
    }
}
