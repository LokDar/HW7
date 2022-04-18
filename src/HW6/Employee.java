package HW6;

public class Employee extends Person {

   private double salary;

    Employee(String name, int age, String gender, double salary) {
        super (name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getName () {
      return this.name;
    }

    public boolean isSameName(Employee employee) {
        return this.getName().equals(employee.getName());
    }





}
