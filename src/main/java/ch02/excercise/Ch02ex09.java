package ch02.excercise;

/**
 * Created on 2016. 9. 10. 오후 4:44.
 *
 * 9. x 축을 따라 이동하며 가스를 소비하는 자동차를 모델링하는 Car 클래스를 구현하라.
 * 지정한 마일(mile)만큼 드라이브하는 메서드 지정한 수만큼 가스 탱크에 갤런을 채우는 메서드,
 * 원점과 연료 레벨로 현재 거리를 구하는 메서드를 구현하라.
 * 생성자에 갤런당 마일 단위(miles/gallons)로 연료 효율성을 지정하라.
 * 불변 클래스로 만들어야 하는가? 그렇거나 그렇지 않은 이유를 제시하라.
 *
 *
 * @author samyeong-gu
 */
public class Ch02ex09 {
}


class Car {

    final int startPointX;
    double gallons;
    double efficiency;

    public Car(int startPointX, double gallons, int efficiency) {
        this.startPointX = startPointX;
        this.gallons = gallons;
        this.efficiency = efficiency;
    }

    public void drive(int miles) {
        gallons = miles / efficiency;
    }

}
