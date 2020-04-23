package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit067_Reverse_it_StringMethods {
    public static void main(String[] args) {
        /*
        Write a program that will reverse a string.
        Your program should reverse a string only 5 characters long.
        If word is shorter, display message: "Too short!".
        If word is longer, display message: "Too long!".
        Otherwise, reverse this word and print out result into the console.

Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa

         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       if(word.length()<5){
           System.out.println("Too short!");
       }else if((word.length()-1)>5){
           System.out.println("Too long!");
       }else{

           String reserve=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
           System.out.println(reserve);
       }

    }
}
