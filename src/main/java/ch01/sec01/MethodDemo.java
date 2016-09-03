package ch01.sec01;

import java.util.Random;

/**
 * Created on 2016. 8. 30. 오후 10:38.
 *
 * @author quest4i
 */
public class MethodDemo {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length());
        System.out.println(new Random().nextInt());

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}
