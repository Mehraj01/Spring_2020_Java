package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class SumOf_InputScanner_For_Loop {
    public static void main(String[] args) {
           /*
        Write a program that asks user to enter number 5 times:
               - Find the sum of those 5 inputs
         */
        Scanner scan=new Scanner(System.in);

        int sum=0;
        for(int i=1; i<=5; i++) {
            System.out.println("Enter your number: ");
            int inputNum = scan.nextInt();
            sum+=inputNum;
        }
        System.out.println("Sum is: "+sum);

        System.out.println("====================================");

        //calculate the sum of all the numbers up to the n variable.
        /*for example:
          n=3
         sum = 1+2+3 = 6
         */


        int n = scan.nextInt();

        int sum1=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);


        System.out.println("====================================");
        //Scanner scan = new Scanner(System.in);
        /*
        calculate the multiplied sum of all the numbers up to the n variable.
        for example:
        n=2
        sum=1*2=2
         */

        int num = scan.nextInt();

        int sum2=1;

        for(int i=1; i<=n;i++){
            sum2*=i;
        }
        System.out.println(sum2);







    }
}
