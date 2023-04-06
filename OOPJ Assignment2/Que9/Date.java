import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean isValid() {
        boolean valid = true;
        try {
            LocalDate.of(year, month, day);
        } catch (Exception e) {
            valid = false;
        }
        return valid;
    }
    
    public int getDayOfWeek() {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getValue() ;
    }
    
    public boolean isLeapYear() {
        return java.time.Year.of(year).isLeap();
    }
    
    public Date getNextDay() {
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate nextDay = date.plusDays(1);
        return new Date(nextDay.getDayOfMonth(), nextDay.getMonthValue(), nextDay.getYear());
    }
    
    public Date getPreviousDay() {
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate previousDay = date.minusDays(1);
        return new Date(previousDay.getDayOfMonth(), previousDay.getMonthValue(), previousDay.getYear());
    }
    
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
    
    public static void main(String[] args) {
        Date date = new Date(31, 12, 2022);
        System.out.println(date.isValid()); // true
        System.out.println(date.getDayOfWeek()); // 6 (Saturday)
        System.out.println(date.isLeapYear()); // false
        Date nextDay = date.getNextDay();
        System.out.println(nextDay.toString()); // 01-01-2023
        Date previousDay = date.getPreviousDay();
        System.out.println(previousDay.toString()); // 30-12-2022
    }
}

// javac Date.java

// java Date       
// true
// 6
// false
// 01-01-2023
// 30-12-2022