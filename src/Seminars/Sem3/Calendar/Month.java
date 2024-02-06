package Seminars.Sem3.Calendar;

public enum Month {
    JAN(1, "Январь", "January"),
    FEB, MAR, APR, MAY, JUN, JUL, AVG, SEP, OCT, NOV, DEC;

    private int numberMonth;
    private String ruValue;
    private String engValue;

    Month(int numberMonth, String ruValue, String engValue) {
        this.numberMonth = numberMonth;
        this.ruValue = ruValue;
        this.engValue = engValue;
    }

    Month() {}

    public int getNumberMonth() {
        return numberMonth;
    }

    public String getRuValue() {
        return ruValue;
    }

    public String getEngValue() {
        return engValue;
    }
}
