package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formatting {
    public static void main(String[] args) {

        //days_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf) );

        /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Apr/23/20
         */

        System.out.println("=========");

        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("E MMMM/dd/yy");

        LocalDate date2 = LocalDate.of(1999, 11, 25);
        String str1 = date2.format(dtf2);

        System.out.println(str1);

        LocalDate date3 =LocalDate.now();

        System.out.println( date3.format(dtf2) );



    }
}
