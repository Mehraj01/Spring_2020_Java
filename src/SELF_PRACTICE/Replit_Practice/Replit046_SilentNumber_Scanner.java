package SELF_PRACTICE.Replit_Practice;
import java.util.Scanner;
public class Replit046_SilentNumber_Scanner {

    public static void main(String[] args) {
        /*
        In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

         */


        Scanner input=new Scanner(System.in);

        System.out.println("Enter your number:");
/*
        int number=input.nextInt();
        int n1=(number/10000);
        System.out.println(n1);
        int n2=(number%10000)/1000;
        System.out.println(n2);
        int n3=(number%10000)%1000/100;
        System.out.println(n3);
        int n4=(number%10000)%1000%100/10;
        System.out.println(n4);
        int n5=(number%10000)%1000%100%10;
        System.out.println(n5);

 */

        int number=input.nextInt();
        int n1=(number/1000);
        System.out.println(n1);
        int n2=(number%1000)/100;
        System.out.println(n2);
        int n3=(number%1000)%100/10;
        System.out.println(n3);
        int n4=(number%1000)%100%10;
        System.out.println(n4);







    }
}
