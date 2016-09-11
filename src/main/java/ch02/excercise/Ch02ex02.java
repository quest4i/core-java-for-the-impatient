package ch02.excercise;

import java.util.Random;
import java.util.Scanner;

/**
 * Created on 2016. 9. 10. 오후 4:21.
 *
 * Scanner 클래스의 nextInt 메서드를 생각해보자. 이 메서드는 접근자인가 변경자인가?
 * 그 이유는 무엇인가?
 * Random 클래스의 nextInt 메서드는 어떤가?
 *
 * 내부 구조를 몰라서 확실하지는 않지만,
 * Random nextInt 메서드는 접근자로 생각된다.
 *
 *
 * @author samyeong-gu
 */
public class Ch02ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = new Random().nextInt();
    }
}
