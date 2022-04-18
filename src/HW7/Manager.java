package HW7;

import Month.Month;

public class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager( String name, double dailySalary, int numberOfSubordinates) {
        super(name, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }



    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // в классе, метод getSalary будет возвращать значение по
    // формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
    // Если количество подчиненных 0, то результат как у обычного рабочего.

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3);
        }
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double allSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            allSalary += getDailySalary() * monthArray[i].getWorkDays() +
                    (getDailySalary() * monthArray[i].getWorkDays() * getNumberOfSubordinates() / 100.0);
        }
        return allSalary;
    }


}
