package ch01.excercise;

/**
 * Created on 2016. 9. 4. 오전 4:34.
 *
 * 정수로 된 각도를 읽고 0~359도 사이의 값으로 정규화한다.
 * 먼저 %연산자로 만들고 floorMod 메서를 사용한다.
 *
 * @author quest4i
 */
public class ch01_ex02 {

    /**
     * 정수로된 각도를 0-359도 사이의 값으로 정규화한다.
     * 1. % 연산자를 이용한다.
     * 2. floorMod 메서르들 이용한다.
     * @param args
     */
    public static void main(String[] args) {

        int rad = 1259;
        System.out.println(rad % 360);
        System.out.println(Math.floorMod(rad, 360));


    }
}
