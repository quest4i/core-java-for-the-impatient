package ch04.sec01;

/**
 * Created on 2016. 9. 18. 오후 5:06.
 *
 * @author quest4i
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
