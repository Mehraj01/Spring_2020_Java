package day28_DateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TimeFormatting {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime time1  = LocalTime.of(9,30, 30);

        System.out.println(time1.format(dtf) );

        LocalTime time2 = LocalTime.of(12,0, 30);

        System.out.println(time2.format(dtf) );

        boolean result1 = time1.isAfter(time2);
        System.out.println(result1);

        LocalDate birt=LocalDate.of(2020,04, 23);
        DateTimeFormatter date1=DateTimeFormatter.ofPattern("MMM/dd/yy");
        System.out.println(birt);
        System.out.println(birt.format(date1));

    }

}
