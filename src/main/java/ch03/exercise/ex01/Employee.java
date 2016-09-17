package ch03.exercise.ex01;

/**
 * Created on 2016. 9. 16. PM 10:25.
 *
 * @author samyeong-gu
 */
public class Employee implements Measurable {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

}
