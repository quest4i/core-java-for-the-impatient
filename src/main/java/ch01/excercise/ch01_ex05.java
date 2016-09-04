package ch01.excercise;

/**
 * Created on 2016. 9. 4. 오후 1:40.
 *
 * int의 최댓값보다 큰 double을 int 타입으로 변환하면 무슨 일이 일어나는가?
 *
 * @author samyeong-gu
 */
public class ch01_ex05 {

    public static void main(String[] args) {

        double more_int = Integer.MAX_VALUE + 1111111.0;
        int target = (int)more_int;

        System.out.println("max int  : " + Integer.MAX_VALUE);
        System.out.println("more_int : " + more_int);
        System.out.println("target   : " + target);

        System.out.println("int의 최댓값을 넘는 double값을 출력하면 값이 잘린다.");
    }
}
