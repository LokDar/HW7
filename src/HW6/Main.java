package HW6;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Sergey",30,"M",10000);
        Employee emp1 = new Employee("Sergey",32,"F",8000);
        Person emp2 = new Person("Sergey",32,"M");

        Employee[] employees = new Employee[]{emp, emp1};
        System.out.println(employees[0].getName());

        System.out.println(emp.isSameName(emp1));
        System.out.println(emp.getName());
        System.out.println(emp2.getName());


        System.out.println(Salary.getSum(employees));




    }
}
