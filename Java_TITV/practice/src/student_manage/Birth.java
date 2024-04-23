package student_manage;

import java.util.Date;

public class Birth {
    private int date;
    private int month;
    private int year;

    public Birth(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date >= 1 && date <= 31) this.date = date;
        else this.date = 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) this.month = month;
        else this.month = 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= (new Date()).getYear()) this.year = year;
        else this.year = 1;
    }
}
