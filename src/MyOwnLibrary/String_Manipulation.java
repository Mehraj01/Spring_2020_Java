package MyOwnLibrary;

import java.util.Scanner;

public class String_Manipulation {
    public static void main(String[] args) {

        // TASK 1.  Initials


 /*
          1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:  input:
					cybertek
					batch12
				output:your initial is: CB (With Upper Case)
 */

 //System.out.println("===============================================================================================");

          // TASK 2.   Reverse String


/*
      3. write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
 */

//System.out.println("===============================================================================================");




    }
}

class print_Initials{
    public static void main(String[] args) {

        // TASK 1.    Initials

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String firstName=input.next();
        System.out.println("Enter Your Last Name:");
        String lastName=input.next();

        String initials=""+firstName.charAt(0)+lastName.charAt(0);

        initials=initials.toUpperCase();
        System.out.println(initials);


//System.out.println("===============================================================================================");

    }
}

class print_Reverse{
    public static void main(String[] args) {

        // TASK 2.    Reverse String

        String str="Java";
               // = 0123

        // with charAt(); method
        String reverse1=""+ str.charAt(str.length()-1)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse1);

        //with substring method
        String reverse2=str.substring(str.length()-1)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
                                     //from index 2 till index 3, from index 1 till index 2, from index 0 till index 1
        System.out.println(reverse2);


//System.out.println("===============================================================================================");

    }

}
