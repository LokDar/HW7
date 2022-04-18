package HW7;

public class Worker extends Employee {

    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    public Worker(String name, double dailySalary) {
        super(name, dailySalary);
    }

    public double getSalary() {
        return getBaseSalary();
    }

}
