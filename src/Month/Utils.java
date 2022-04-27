package Month;

public final class Utils {
    private static final Month[] allMonth =
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
    public static Month[] getJanFebMar() {
        return new Month[]{allMonth[0],allMonth[1],allMonth[2]};
    }
    public static Month[] getAprMayJun() {
        return new Month[]{allMonth[3],allMonth[4],allMonth[5]};
    }
    public static Month[] getJulAugSep() {
        return new Month[]{allMonth[6],allMonth[7],allMonth[8]};
    }
    public static Month[] getOctNovDec() {
        return new Month[]{allMonth[9],allMonth[10],allMonth[11]};
    }
    public static Month[] getFirstHalfOfYear() {
        return new Month[]{allMonth[0],allMonth[1],allMonth[2],allMonth[3],allMonth[4],allMonth[5]};
    }
    public static Month[] getSecondHalfOfYear() {
        return new Month[]{allMonth[6],allMonth[7],allMonth[8],allMonth[9],allMonth[10],allMonth[11]};
    }

}
