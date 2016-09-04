package ch01.excercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2016. 9. 4. 오후 1:54.
 *
 * 텍스트 한 줄을 읽고
 * 아스키 외의 모든 문자를 유니코드 값과 함께 출력하는 프로그램.
 *
 * @author samyeong-gu
 */
public class ch01_ex11 {

    public static void main(String[] args) {
        
        String line = new Scanner(System.in).nextLine();

        int[] codePoints = line.codePoints().toArray();
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 255) {
                System.out.println(chars[i] + " : " + codePoints[i]);
            }
        }
    }
}
