
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Date: "+date);
        LocalTime time=LocalTime.now();
        System.out.println("Time: "+time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Date and Time: "+dateTime);

        /*
        Display the day of the month.
        Display the day of the year.
        Display the week Name, Month Name, Month Number.
        */
        DateTimeFormatter format=DateTimeFormatter.ofPattern("D, MMM dd yyyy");

        /*
        D - Day of the Year (1-365/366)
        E - Name of the Day (Mon-Sun)
        dd - Day of the Month (1-31)
        M - Month Number (1-12)
        MMM - Month Name (Jan-Dec)
        */
        String formattedDateTime=dateTime.format(format);
        System.out.println("Formatted Date: "+formattedDateTime);
    }
}