package HW7;

public final class Director extends Worker {
    private final int numberOfSubordinates;
    private final int COEFFICIENT = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
//  Необходимо создать класс Director с теми же методами,
    //  что и Manager, но метод getSalary должен возвращать результат
    //  по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
    //  Если количество подчиненных 0, то результат как у обычного рабочего.

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * COEFFICIENT);
        }
    }
}
