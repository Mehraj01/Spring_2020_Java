package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit32_Scanner3 {
    public static void main(String[] args) {
        /*
        Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSecond=input.nextInt();

        int hours=(inputSecond/3600);
        int minutes=(inputSecond%3600)/60;
        int seconds=(inputSecond%3600)%60;

        String result1=hours+"hours"+","+minutes+"minutes"+","+seconds+"second";


        System.out.println(result1);




    }

}
