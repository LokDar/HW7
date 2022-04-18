package HW7;

import Month.Month;

public class Employee {
   private double baseSalary;
   private String name;
   private double dailySalary;


    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;

    }

    public Employee(String name ,double dailySalary) {
        this.dailySalary = dailySalary;
        this.name = name;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public double getSalary (Month[] monthArray) {
        double allSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            allSalary+= getDailySalary() * monthArray[i].getWorkDays();
        }
        return allSalary;
    }



}
