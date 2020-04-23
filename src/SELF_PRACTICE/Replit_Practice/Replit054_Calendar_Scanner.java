package SELF_PRACTICE.Replit_Practice;
import java.util.Scanner;
public class Replit054_Calendar_Scanner {
    public static void main(String[] args) {
        /*
        Write a program that will print out month name by receiving a number. Use switch statement for conditions.
        Example:
        Display message: "Enter month number:"
        input: 5
        Display message: "May"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter month number:");
        int month=scan.nextInt();
        String result="";

        switch(month){
            case 1:
                result="January";
                break;
            case 2:
                result="February";
                break;
            case 3:
                result="March";
                break;
            case 4:
                result="April";
                break;
            case 5:
                result="May";
                break;
            case 6:
                result="June";
                break;
            case 7:
                result="July";
                break;
            case 8:
                result="August";
                break;
            case 9:
                result="September";
                break;
            case 10:
                result="October";
                break;
            case 11:
                result="November";
                break;
            case 12:
                result="December";
                break;
            default:
                result="There is no such a month";
                break;
        }
        System.out.println(result);




    }
}
