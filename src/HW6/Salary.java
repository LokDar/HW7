package HW6;

public class Salary {

    public static double getSum (Employee[] employeeArray) {
        double sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].getSalary();
        }
        return sum;
    }
}
