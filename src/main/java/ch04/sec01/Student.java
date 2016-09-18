package ch04.sec01;

/**
 * Created on 2016. 9. 18. 오후 5:20.
 *
 * @author quest4i
 */
public class Student extends Person implements Named {

    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}
