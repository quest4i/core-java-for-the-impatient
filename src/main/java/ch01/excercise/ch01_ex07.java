package ch01.excercise;

import java.util.Scanner;

/**
 * Created on 2016. 9. 4. 오후 1:42.
 *
 * 0~65_535 사이의 숫자 두 개를 읽어서 short 변수에 저장한 후
 * int로 변환하지 않은 채로 부호 없는 합계, 차이, 곱, 몫, 나머지를 계산한다.
 *
 * @author samyeong-gu
 */
public class ch01_ex07 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        short a = in.nextShort();
        short b = in.nextShort();

        System.out.println(" a, b : " + a + " : " + b);
        System.out.println("합계 : " + (a + b));
        System.out.println("차이 : " + (a - b));
        System.out.println("합계 : " + (a * b));
        System.out.println("합계 : " + (a / b));
        System.out.println("합계 : " + (a % b));

    }
}
