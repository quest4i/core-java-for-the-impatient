package ch01.excercise;

import java.util.Random;

/**
 * Created on 2016. 9. 4. 오후 1:54.
 *
 * 임의의 long값을 생성한 후
 * 36진수로 출력해서 임의의 글자와 숫자로 구성된 문자열을 만든다.
 *
 * @author samyeong-gu
 */
public class ch01_ex10 {

    public static void main(String[] args) {

        long number = new Random().nextLong();
        String output = Long.toString(number, 36);
        System.out.println(output);
    }
}
