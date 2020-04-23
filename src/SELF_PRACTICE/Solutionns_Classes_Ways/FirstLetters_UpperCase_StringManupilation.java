package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class FirstLetters_UpperCase_StringManupilation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName=scan.nextLine();
        System.out.println("Enter your last name");
        String lastName=scan.nextLine();

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        //System.out.println(firstName+" "+lastName);
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        System.out.println("================================");

        // to do it with a charAt method.
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);



    }
}
