package Month;

public class Utils {
    private static Month[] allMonth =
            {new Month("January", 31, 21),
            new Month("February", 28, 20),
            new Month("March", 31, 23),
            new Month("April", 30, 21),
            new Month("May", 31, 22),
            new Month("June", 30, 22),
            new Month("July", 31, 21),
            new Month("August", 31, 23),
            new Month("September", 30, 22),
            new Month("October", 31, 21),
            new Month("November", 30, 22),
            new Month("December", 31, 22)};


    public static Month[] getAllMonth() {
        return allMonth;
    }
}
