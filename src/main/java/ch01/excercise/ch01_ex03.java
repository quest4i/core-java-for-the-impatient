package ch01.excercise;

import java.io.Console;
import java.util.Scanner;

/**
 * Created on 2016. 9. 4. 오전 4:39.
 *
 * 1. 조건 연산자만 사용해서 정수 세 개를 읽고 최댓값을 출력한다.
 * 2. Math.max를 사용해서 같은 프로그램을 작성한다.
 *
 * @author quest4i
 */
public class ch01_ex03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (a < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("max : " + max);
        System.out.println("max : " + maxNumber(a, b, c));
    }

    public static int maxNumber(int first, int... rest) {
        int result = first;
        for (int v : rest) result = Math.max(v, result);
        return result;
    }

}
