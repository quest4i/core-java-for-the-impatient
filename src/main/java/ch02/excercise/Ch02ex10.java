package ch02.excercise;

import java.util.ArrayList;
import java.util.Random;

import static com.sun.tools.doclint.Entity.or;

/**
 * Created on 2016. 9. 10. 오후 4:46.
 *
 * 10. RandomNumbers 클래스 안에 정적 메서드 randomElement 두 개를 구현하라.
 * randomElement는 정수의 배열이나 배열 리스트로부터 임의의 요소를 얻는다
 * (해당 별이나 배열 리스트가 비어 있으면 0을 반환한다).
 * 이 메서드들을 int[]나 ArrayList<Integer>의 인스턴스 메서드로 만들 수 없는 이유는 무엇인가?
 *
 * @author samyeong-gu
 */
public class Ch02ex10 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        System.out.println(RandomNumbers.randomElement(array));
        System.out.println(RandomNumbers.randomElement(list));
    }
}


class RandomNumbers {

    private static Random random = new Random();

    public static int randomElement(int[] array) {
        if (null == array || array.length == 0) {
            return 0;
        }
        int index = random.nextInt(array.length);
        return array[index];
    }

    public static int randomElement(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
