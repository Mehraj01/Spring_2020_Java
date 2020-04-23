package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit110_Print_arterisk_nTimeLoops {
    public static void main(String[] args) {
        /*
        Given an int variable n that has already been declared and initialized to a positive value,
        and another int variable j that has already been declared,
        use a for loop to print a single line consisting of n asterisks.
        Thus if n contains 5, five asterisks will be printed. Use no variables other than n and j.

Example:
input: 1
output: *

Example:
input: 3
output: ***

         */

        int j = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for(int i=0; i<n; i++){
            System.out.print("*");

        }








    }
}
