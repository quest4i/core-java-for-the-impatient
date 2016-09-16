package ch03.sec03;

/**
 * Created on 2016. 9. 16. 오전 2:24.
 *
 * @author quest4i
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
        this("", 0);
    }


    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
