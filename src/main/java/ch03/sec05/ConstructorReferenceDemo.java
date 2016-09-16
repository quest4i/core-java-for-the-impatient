package ch03.sec05;

import java.util.ArrayList;

/**
 * Created on 2016. 9. 16. 오전 5:57.
 *
 * @author quest4i
 */
public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);
        for (Employee e : employees) System.out.println(e.getName());
    }
}
