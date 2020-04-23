package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit062_FirstAndLast_letter {
    public static void main(String[] args) {
        /*
        Write a program that will print out first and last letters together.
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstLast=word.substring(0,1)+word.substring(word.length()-1);
        System.out.println(firstLast);



    }
}
