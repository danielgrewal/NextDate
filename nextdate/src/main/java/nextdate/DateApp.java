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

        // check for leap year
        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        if (month == 2) {
            if (isLeapYear)
                lastDay = 29; // February in a leap year
            else
                lastDay = 28; // February in a common year
        } else if (month == 4 || month == 6 || month == 9 || month == 11)
            lastDay = 30; // April, June, September, November have 30 days
        else
            lastDay = 31; // All other months have 31 days

        // Date validation
        if (year < 1812 || year > 2212 || month < 1 || month > 12 || day < 1 || day > lastDay)
            return "Invalid Date";

        // Calculate the next day
        if (day == lastDay) {
            if (month == 12)
                return String.format("%d-%02d-%02d", year + 1, 01, 01); // New Year
            else
                return String.format("%d-%02d-%02d", year, month + 1, 01); // First day of the next month
        } else
            return String.format("%d-%02d-%02d", year, month, day + 1); // Next day in the same month
    }
}
