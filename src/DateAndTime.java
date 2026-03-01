import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getYear()+1900);

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTime());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.getZone());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss:SS z Z");
        System.out.println(formatter.format(zonedDateTime));

    }
}
