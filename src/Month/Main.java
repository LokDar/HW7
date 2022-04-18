package Month;

import HW7.Employee;
import HW7.Manager;

public class Main {
    public static void main(String[] args) {

      //  System.out.println(Utils.getAllMonth()[0].getMonthName());


        Employee Sergey = new Employee("Serg",10.0);
        Employee Tom = new Employee("Tom",4.0);
        Employee Sara = new Employee("Sara",1.0);
        Manager Tonny = new Manager("Tonny", 4.0,15);

        Month[] month2 = {Utils.getAllMonth()[0],Utils.getAllMonth()[1]};


        System.out.println(Sergey.getSalary(month2));
        System.out.println(Sergey.getSalary(Utils.getAllMonth()));

        System.out.println(Tonny.getSalary(month2));
        System.out.println(Tom.getSalary(month2));








    }
}
