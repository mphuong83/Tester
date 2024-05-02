package junit;

public class NextDate {
    public static String nextDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            return "Invalid Date";
        }
        
        day++;
        if (day > daysInMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        
        return day + "/" + month + "/" + year;
    }
    
    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1812 || year > 2012 || month < 1 || month > 12) {
            return false;
        }
        
        return day >= 1 && day <= daysInMonth(month, year);
    }
    
    private static int daysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }
    
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
