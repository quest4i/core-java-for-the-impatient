package ch01.excercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2016. 9. 4. 오후 1:52.
 *
 * 문자열을 읽어서 비어 있지 않는 부분 문자열을 모두 출력한다.
 *
 * @author samyeong-gu
 */
public class ch01_ex08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Arrays.stream(str.split("\\s+")).forEach(System.out::println);
    }
}
