package ch01.excercise;

import java.math.BigInteger;

import static ch01.excercise.ch01_ex06.factorial;

/**
 * Created on 2016. 9. 4. 오후 1:41.
 *
 * 1. BigInteger를 사용해 팩토리얼 n! = 1 x 2 x ... x n을 계산한다
 * 2. 그리고 프로그램을 이용해 1_000 팩토리얼을 계산한다.
 *
 * @author samyeong-gu
 */
public class ch01_ex06 {
    public static void main(String[] args) {

        System.out.println("1000 factorial : " + factorial(1_000));
    }

    public static BigInteger factorial(int n) {
        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }
}
