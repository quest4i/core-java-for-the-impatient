package ch03.exercise.ex05;

import ch03.exercise.ex04.IntSequence;

/**
 * Created on 2016. 9. 17. PM 8:09.
 *
 * 무한 상수 시퀀스를 돌려주는 IntSequence 클래스의 정적 메서드 constant를 구현하라.
 * 예를 들어 IntSequence.constant(1)은 값 1 1 1 ... 을 돌려준다.
 * 람다 표현식으로 만들면 추가 점수가 있다.
 * *
 * @author samyeong-gu
 */
public class Ex05 {

    public static void main(String[] args) {
        IntSequence seq = IntSequence.constant(1);
        for (int i = 0; i < 100 && seq.hasNext(); i++) {
            System.out.println(i + " : " + seq.next());
        }
    }
}
