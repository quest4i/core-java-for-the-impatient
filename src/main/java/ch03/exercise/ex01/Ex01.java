package ch03.exercise.ex01;

import com.sun.xml.internal.ws.handler.MessageUpdatableContext;

import java.util.*;

import static com.sun.tools.doclint.Entity.sum;
import static java.util.Arrays.stream;

/**
 * Created on 2016. 9. 16. PM 10:29.
 *
 * @author samyeong-gu
 */
public class Ex01 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("hi", 40000);
        employees[1] = new Employee("hi", 50000);
        employees[2] = new Employee("hi", 90000);
        employees[3] = new Employee("hi", 60000);

        System.out.println("average salary : " + average(employees));
        System.out.println("largest : " + ((Employee)largest(employees)).getName());
    }

    public static double average(Measurable[] objects) {
        List<Measurable> list = new ArrayList<>(Arrays.asList(objects));
        list.removeIf(Objects::isNull);
        return list.stream().mapToDouble(Measurable::getMeasure).sum() / list.size();
    }

    public static Measurable largest(Measurable[] objects) {
        Arrays.sort(objects, Comparator.comparingDouble(o -> o.getMeasure()));
        return objects[0];
    }
}
