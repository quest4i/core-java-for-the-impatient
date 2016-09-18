package ch04.sec01;

import java.util.ArrayList;

/**
 * Created on 2016. 9. 18. 오후 4:57.
 *
 * @author quest4i
 */
public class AnonymousSubclassDemo {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(100) {
            public void add(int index, String element) {
                super.add(index, element);
                System.out.printf("Adding %s at %d\n", element, index);
            }
        };

        names.add(0, "Peter");
        names.add(1, "Paul");
        names.add(0, "Mary");
        System.out.println(names);

        invite(new ArrayList<String>() {
            {
                add("Harry");
                add("Sally");
            }
        });
    }

    public static void invite(ArrayList<String> friends) {
        System.out.println("Guest list: " + friends);
    }
}
