package nextdate;

/**
 * SOFE3980 Homework Assignment - NextDate
 * Daniel Grewal 100768376
 */
public class DateApp {
    int year;
    int month;
    int day;

    public DateApp(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String NextDate() {
        int lastDay;

        if (month == 2 && year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0)
                lastDay = 29;
            else if (year % 100 == 0 && year % 400 != 0)
                lastDay = 28;
            else
                lastDay = 29;
        } else if (month == 2 && year % 4 != 0)
            lastDay = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            lastDay = 30;
        else
            lastDay = 31;

        if (year < 1812 || year > 2212 || month < 1 || month > 12 || day < 1 || day > lastDay)
            return "Invalid Date";

        if (day == lastDay) {
            if (month == 12)
                return String.format("%s-%s-%s", year + 1, 1, 1);
            else
                return String.format("%s-%s-%s", year, month + 1, 1);
        } else
            return String.format("%s-%s-%s", year, month, day + 1);

    }
}
