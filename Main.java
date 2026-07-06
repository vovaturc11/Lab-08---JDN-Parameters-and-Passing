// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:
// DATE:

public class Main
{
    public static void main(String[] args)
    {
        int johnsonJulianDate;
        int myBirthdayJulianDate;
        int moonLandingJulianDate;

        johnsonJulianDate = calcJulianDate(8, 26, 1918);
        myBirthdayJulianDate = calcJulianDate(6, 11, 2007);
        moonLandingJulianDate = calcJulianDate(7, 20, 1969);

        System.out.println("Katherine Johnson's Julian Day Number: " + johnsonJulianDate);
        System.out.println("My birthday Julian Day Number: " + myBirthdayJulianDate);
        System.out.println("Moon landing Julian Day Number: " + moonLandingJulianDate);
    }

    /**
     * Calculates and returns the Julian Day Number for a given date.
     * Precondition: monthToday, dayToday, and yearToday must represent a valid calendar date.
     * Postcondition: The Julian Day Number for the provided date is returned.
     *
     * @param monthToday the month number
     * @param dayToday the day number
     * @param yearToday the year number
     * @return the Julian Day Number
     */
    public static int calcJulianDate(int monthToday, int dayToday, int yearToday)
    {
        int a;
        int y;
        int m;

        a = (14 - monthToday) / 12;
        y = yearToday + 4800 - a;
        m = monthToday + 12 * a - 3;

        int julianDayNumber = dayToday + (153 * m + 2) / 5 + 365 * y
                + y / 4 - y / 100 + y / 400 - 32045;

        return julianDayNumber;
    }
}
