package ch03.exercise.ex04;

/**
 * Created on 2016. 9. 17. PM 7:17.
 *
 * 인자들로 구성된 시퀀스를 돌려주는 IntSequence 클래스의 정적 메서드 of를 구현하라.
 * 예를 들어 IntSequence.of(3, 1, 4, 1, 5, 9)는 값 여섯 개로 구성된 시퀀스를 돌려준다.
 * 익명 내부 클래스의 인스턴스를 반환하게 만들면 추가 점수가 있다.
 *
 * @author samyeong-gu
 */
public class Ex04 {
    public static void main(String[] args) {
        IntSequence seq = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (seq.hasNext()) {
            System.out.println(seq.next());
        }
    }
}



