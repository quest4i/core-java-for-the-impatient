package ch02.excercise;

/**
 * Created on 2016. 9. 10. 오후 4:28.
 * <p>
 * 평면에 놓인 점을 기술하는 불변 클래스 Point를 구현하라.
 * 특정 점으로 설정하는 생성자와 원점으로 설정하는 인자 없는 생성자 getX, getY, translate, scale 메서드를 구현하라.
 * translate 메서드는 x와 y 방향으로 주어진 길이만큼 점을 옮긴다.
 * scale메서드는 주어진 비율로 두 좌표의 크기를 조절한다.
 * 결과로 새로운 점을 반환하도록 이 메서드들을 구현하라.
 * 예를 들어 다음 문장은 p를 좌표가 (2, 3.5)인 점으로 실행해야 한다.
 * <p>
 * Point p = new Point(3, 4).translate(1, 3).scale(0.5);
 *
 * @author samyeong-gu
 */
public class Ch02ex05 {


    public static void main(String[] args) {

        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}


final class Point {

    double x;
    double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     *
     * @param x x를 x만큼 이동한다.
     * @param y y를 y만큼 이동한다.
     * @return 자신의 레퍼런스를 반환한다.
     */
    public Point translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Point scale(double number) {
        x *= number;
        y *= number;
        return this;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

