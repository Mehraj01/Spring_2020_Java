package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;
/*
In mathematics, the factorial of a positive integer n, denoted by n!,
is the product of all positive integers less than or equal to n.  Calculate factorial and output result to the console.
Example:
input: 5
output: 120


 */

public class Replit092_Factorial_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factorial=1;

        for(int i=1; i<=n; i++ ){
            factorial=factorial*i;
        }
        System.out.println(factorial);




    }
}
