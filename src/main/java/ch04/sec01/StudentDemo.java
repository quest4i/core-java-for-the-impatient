package ch04.sec01;

/**
 * Created on 2016. 9. 18. 오후 5:21.
 *
 * @author quest4i
 */
public class StudentDemo {

    public static void main(String[] args) {
        Person p = new Student("Fred", 1729);
        System.out.println(p.getName());
        Student s = (Student) p;
        System.out.println(s.getName());
        Named n = s;
        System.out.println(n.getName());
    }
}
