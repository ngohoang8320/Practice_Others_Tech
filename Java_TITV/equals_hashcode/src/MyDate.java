import java.util.Date;

public class MyDate {
    private int date;
    private int month;
    private int year;

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date >= 1 && date <= 31)
            this.date = date;
        else
            this.date = 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else
            this.month = 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (MyDate.this.year >= 1 && MyDate.this.year <= (new Date()).getYear())
            this.year = year;
        else
            this.year = 1;
    }

    @Override
    public String toString() {
        return this.date + "/" + this.month + "/" + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;

        MyDate myDate = (MyDate) o;

//        if (getDate() != myDate.getDate()) return false;
//        if (getMonth() != myDate.getMonth()) return false;
        return getYear() == myDate.getYear();
    }

    @Override
    public int hashCode() {
        int result = getDate();
        result = 31 * result + getMonth();
        result = 31 * result + getYear();
        return result;
    }
}
