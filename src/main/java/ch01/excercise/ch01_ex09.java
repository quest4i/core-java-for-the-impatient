package ch01.excercise;

/**
 * Created on 2016. 9. 4. 오후 1:52.
 *
 * 1.5.3 문자열 비교에는 s.equals(t)지만 s != t 인 두 문자열 s, t를 비교하는 예제가 있다.
 * substring을 사용하지 않는 다른 예를 제시하라.
 *
 * @author samyeong-gu
 */
public class ch01_ex09 {

    public static void main(String[] args) {

        String greeting = "Hello, World!";
        String location = "World";
//        String other = greeting.substring(7, 12);
        String other = new String("World");

        System.out.println("World" == other);

    }
}
