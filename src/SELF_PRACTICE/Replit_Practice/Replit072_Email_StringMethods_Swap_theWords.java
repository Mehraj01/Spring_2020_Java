package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit072_Email_StringMethods_Swap_theWords {
    public static void main(String[] args) {
        /*
        In this task, you need to swap the first name with the last name in the email.
        If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
         */

        Scanner scan = new Scanner(System.in);
        String email = scan.next(); //mike_tyson@gmail.com

        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));

        if (email.contains("_")){
            System.out.println(lastName+"_"+firstName+"@gmail.com");
        }else{
            System.out.println(email);
        }
    }
}




