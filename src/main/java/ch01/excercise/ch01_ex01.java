package ch01.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2016. 9. 4. 오전 4:12.
 *
 * 1. 정수를 읽어서 2진수, 8진수, 16진수로 출력한다.
 * 2. 역수를 16진 부동소수점수로 출력한다.
 *
 * @author quest4i
 */
public class ch01_ex01 {

    /**
     * 1. 정수를 읽어서 2진수 8진수 16진수로 출력한다.
     * 2. 역수를 16진 부동소수점 수로 출력한다.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("input number : " + number);
        System.out.println("2진수 : " + Integer.toString(number, 2));
        System.out.printf("8진수 : %o\n", number);
        System.out.printf("16진수 : %X\n", number);
        StringBuilder sb = new StringBuilder(Integer.toString(number));
        System.out.println(sb.reverse());
    }
}
