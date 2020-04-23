package day10_Switch_Scanner;
import java.util.Scanner;
public class rateCalculater {
    public static void main(String[] args) {

        /*
        write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
         */

        Scanner rate=new Scanner(System.in);

        System.out.println("Enter Your salary: ");
        int salary=rate.nextInt();

        System.out.println("Enter how many hours you work in a week: ");
        int hoursInWeek=rate.nextInt();

        System.out.println("How many weeks do you work in a year?");
        int totalweeks=rate.nextInt();

        //HourlyRate=(salary/numberofweeks)/weeklyHours

        System.out.println("Your Hourly Rate is: "+((salary/52)/hoursInWeek));









    }
}
