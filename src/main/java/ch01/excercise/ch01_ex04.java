package ch01.excercise;

/**
 * Created on 2016. 9. 4. 오후 1:39.
 *
 * @author samyeong-gu
 */
public class ch01_ex04 {

    /**
     * double 타입의 양수 값 중 가장 작은 값과 가장 큰 값을 출력한다.
     * hint - Math.nextUp
     * @param args
     */
    public static void main(String[] args) {

        double plus_min = Math.nextUp(0.0);
        double plus_max = Double.MAX_VALUE;

        System.out.println("double plus min : " + plus_min);
        System.out.println("double plus max : " + plus_max);
    }
}
