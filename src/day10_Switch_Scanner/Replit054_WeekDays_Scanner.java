package day10_Switch_Scanner;
import java.util.Scanner;
public class Replit054_WeekDays_Scanner {
    public static void main(String[] args) {
        /*
         Write a program that will print a week day according to the day number. Use switch statement.
         Example
         Display message: "Enter number:"
         1
         Display message: "Monday"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number:");

        int weekday=scan.nextInt();
        String result="";

        switch(weekday){
            case 1:
                result="Monday";
                break;
            case 2:
               result="Tuesday";
               break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
            default:
                result="There is no such a day";

        }
        System.out.println(result);
    }
}
