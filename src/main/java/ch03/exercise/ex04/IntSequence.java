package ch03.exercise.ex04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 2016. 9. 17. PM 7:18.
 *
 * @author samyeong-gu
 */
public interface IntSequence {

    boolean hasNext();
    int next();

    static IntSequence of(int... args) {
        return new IntSequence() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < args.length;
            }

            @Override
            public int next() {
                int value = args[index];
                index++;
                return value;
            }
        };
    }
}
