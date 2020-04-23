package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class Print_LastLetters_StringManupilation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("What is your last name");
        String lastName = input.nextLine();

        // 1. way to to it:
       String lastLetter=""+firstName.charAt(firstName.length()-1)+"."+lastName.charAt(lastName.length()-1);
       lastLetter=lastLetter.toUpperCase();
       System.out.println("Last letters are: "+lastLetter);

       System.out.println("===========================================================================");

       // 2. way to do it
        int firstNameIndex=firstName.length()-1;
        int lastNameIndex=lastName.length()-1;
        String lastLetter2=firstName.substring(firstNameIndex)+"."+lastName.substring(lastNameIndex);
        lastLetter2=lastLetter2.toUpperCase();
        System.out.println("Last letters are: "+lastLetter2);












    }
}
