package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class Print_Initials_Using_StringManupilation {
/*
Print Your Initials to the consol
Print Upprecase Initials
Add dot beetween the letters
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("What is your last name");
        String LastName = input.nextLine();

        String initials = firstName.substring(0, 1).concat(".") + LastName.substring(0, 1);
                                      // We adding substring index (0,1) because its beginning index and ending index.
                                         // if we add only (0) it print from 0 to till ending index...
        initials = initials.toUpperCase();
        System.out.println("Initial is: " + initials);

        System.out.println("===========================================================================");
        // another way to print initials is the charAt() way

        String initials1 =""+ firstName.charAt(0)+"."+ LastName.charAt(0);//We cant concat char to the string.
                                                                        // Only way to that is ADD DOUBLE QUOTE "" between them
        initials = initials.toUpperCase();
        System.out.println("Initial is: " + initials);




        System.out.println(firstName.charAt(0)+ LastName.charAt(0));
        // 65 + 66 =131    (Correct)
        // 'A'+'B' ==> 'AB' (Wrong) If you dont and double quote it is a char and char character the returns numbers










    }
    }
