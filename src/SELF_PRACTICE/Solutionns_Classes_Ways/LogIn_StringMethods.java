package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class LogIn_StringMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Add your gmail");
        String user = in.next().toLowerCase(); // add lowercase method next to user input
        String pass = in.next();

        String username = "aghayeva@gmail.com";
        String password = "Good";


        if (user.endsWith("@gmail.com")){ //  // Nested if Precondition.
            // we dont use contains method because it will take the word doesnt matter where location it is
            if (user.equalsIgnoreCase(username) && pass.equals(password)){
                System.out.println("Logged in successfully");
            }else{
                System.out.println("Invalid username and password");
            }

        }else{
            System.out.println("Invalid email address");// if precondition fails this line will be executed...
        }




    }
}
