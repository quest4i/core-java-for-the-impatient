package ch03.sec02;

/**
 * Created on 2016. 9. 16. 오전 1:57.
 *
 * @author quest4i
 */
public class Employee implements Person, Identified {

    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return Identified.super.getId();
    }

}
