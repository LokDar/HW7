package Month;

public class Month {
    private String monthName;
    private int totalDays;
    private int workDays;

    public Month(String monthName, int totalDays, int workDays) {
        this.monthName = monthName;
        this.totalDays = totalDays;
        this.workDays = workDays;
    }


    public String getMonthName() {
        return monthName;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getWorkDays() {
        return workDays;
    }
}
