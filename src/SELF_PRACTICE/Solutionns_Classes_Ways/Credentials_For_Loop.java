package SELF_PRACTICE.Solutionns_Classes_Ways;
import java.util.Scanner;
public class Credentials_For_Loop {
    public static void main(String[] args) {
         /*
        Write a program that asks user to enter his/her username and password until user enters correctly.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String user = input.next();
        System.out.println("Enter your password");
        String pass = input.next();

        String username="Hello";
        String password="World13";

        boolean result=user.equals(username) && pass.equals(password);
        //

        int count=1;// how many attempt i have

        while(!result){
            System.out.println("Incorrect username or password");
            System.out.println("Enter your username");
            user = input.next();
            System.out.println("Enter your password");
            pass = input.next();

            result=user.equals(username) && pass.equals(password);
            // validating new username and password

            count++;
            if(count==3 && !result){// already have three attempts and credentials are still incorrect
                System.out.println("Your account is locked");
                break;
            }

        }
        if(result){
            System.out.println("You logged in");


        }


    }
}
