package MyOwnLibrary.CODES;/*


-> DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");  -> 26/May/2020
                         = DateTimeFormatter.ofPattern("E MMMM/dd/yy"); -> Thu November/25/99
                         = DateTimeFormatter.ofPattern("hh:mm:ss a"); -> 09:30:30 AM
                         = DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a"); -> Fri, 12/25 11:30 PM


-> LocalDate date = LocalDate.now(); -> 2020-08-28
   LocalDate birthday = LocalDate.of(2020, 12, 25);

-> LocalTime time = LocalTime.of(9,30, 30);
   LocalTime time = LocalTime.now();

-> LocalDateTime datetime = LocalDateTime.of(2015, 12, 25, 23,30,45);  -> 2015-12-25T23:30:45


-> boolean result = date.isAfter(birthday);
                 = date.isBefore(birthday);
                 = date1.isEqual(birthday);
                 = birthday.isLeapYear();

-> System.out.println(date.format(dtf) );
-> System.out.println(result);
-> LocalDate[] birthdays = {JohnBirthday, AaronBirthday, DanielBirthday};


-> Format Options:
    - year -> yy, yyyy
    - month -> MM (number), MMM (three letters), MMMM (full name)
    - days -> dd
    - days -> E (three letter), EEEE (Full name)
    - hours -> hh
    - minutes -> mm
    - second -> ss
    - am/pm -> a

-> import java.time.LocalDate;
   import java.time.LocalDateTime;
   import java.time.LocalTime;
   import java.time.format.DateTimeFormatter;





*/
//System.out.println("===============================================================================================");

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DateT_F_Decimal_F { }

class DecimalFormatter{
    public static void main(String[] args) {

        // import java.text.DecimalFormat;

        // - rounding the decimals
        // - DecimalFormat DF=new DecimalFormat();// result: ->  3.333
        DecimalFormat DF=new DecimalFormat("0.00");// result: -> 3.33

        double a=10.0/3.0;
        System.out.println(a);
        System.out.println(DF.format(a));

        System.out.println(2.3467899);
        // - when you round the number u hav to check the second and third decimal.
        // If its bigger it will be rounded to the bigger number.
        System.out.println(DF.format(2.3467899));

    }
}

//System.out.println("===============================================================================================");

class DateTimeFormatter_1{
    public static void main(String[] args) {


        // this is a format way u wanna your day/month/year looks
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1 = LocalDate.now(); // Prints current  year/month/day
        System.out.println(date1); // 2020-08-28

        //  Prints current day/month/year in format of ==> dft
        System.out.println(date1.format(dtf) ); //Prints 26/May/2020



System.out.println("********************************************************");


        // this is a format way u wanna your "E MMMM/dd/yy" looks
        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("E MMMM/dd/yy"); // for ex: Thu November/25/99

        LocalDate date2 = LocalDate.of(1999, 11, 25); // Prints 1999-11-25
        //Format date2 ==> format of dtf2
        String str1 = date2.format(dtf2); // changes format "E MMMM/dd/yy" ==> Thu November/25/99
        System.out.println(str1);

        LocalDate date3 =LocalDate.now(); // Current year/month/day. ==> For example  2020-05-26

        //  Prints current day/month/year in format of ==> dft2
        System.out.println( date3.format(dtf2) ); // Prints current  WeekDay Month/day/year ==> for example:(Tue May/26/20)







    }

}
//System.out.println("===============================================================================================");

class dates{
    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(2020, 12, 25);
        System.out.println(birthday);


        // isAfter(date2)
        boolean result1 =    date1.isAfter(birthday);
        System.out.println(result1);

        // isBefore(date2)
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        // isEqual(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        // isLeapyear();
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);


        System.out.println("=========================================================");

        LocalDate now = LocalDate.now(); // 2020-04-23
        System.out.println("Today is: "+now);

        String str = now.toString();
        System.out.println(str.replace("-", " "));


    }
}

class TimeFormatting{
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

class Time{
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.now();

        System.out.println(time1);

        LocalTime time2 = LocalTime.of(23, 50, 30);

        System.out.println(time2);

    }
}
class DateTime_Formatting{
    public static void main(String[] args) {

        LocalDateTime datetime1 = LocalDateTime.of(2015, 12, 25, 23,30,45);

        System.out.println(datetime1);

        //12/25 11:30 am, Tue

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a");

        String str = datetime1.format(dtf)  ;

        System.out.println(str);
    }
}

class Print_Birthdays{

    public static void main(String[] args) {

         /*
    Warmup task:
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and thier birthdays
     */
        String[] friends = {"John", "Aaron", "Daniel"};
        //        0       1        2

        LocalDate JohnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirthday  = LocalDate.of(2010, 5, 6);

        LocalDate[] birthdays = {JohnBirthday, AaronBirthday, DanielBirthday};
        //   0               1            2

        for(int i = 0; i < friends.length; i++){
            String name = friends[i];
            LocalDate bd = birthdays[i];
            System.out.println( name+"'s birthday is "+ bd );
        }

    }
}
class DateTime{
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);


        // 2020-03-20 11:25:30
        LocalDate date = LocalDate.of(2020, 3, 20);
        LocalTime time = LocalTime.of(11, 25, 30);

        LocalDateTime dateTime = LocalDateTime.of( date, time);

        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.of(2020,3,20,11,25,30);

        System.out.println(dateTime2);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  // 3/20/2020
        LocalDate date2 = LocalDate.of(2019, 3, 20);

        System.out.println( date2.format(dtf) );

    }
}
class birthday_2{
    public static void main(String[] args) {

        HappyBirthDay(2000, 4, 24);

    }

    public static void HappyBirthDay(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();
        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            return;
        }
        System.out.println("Today is not your birthday yet");
    }

}
