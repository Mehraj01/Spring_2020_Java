package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class MaxMinNum_InputScanner_For_Loop {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter number 5 times:
          -Find the maximum number
         */
        Scanner input=new Scanner(System.in);

        int max=0;// you add negative number too int max= -9999999;
        for(int i=1; i<=5; i++) {
            System.out.println("Enter a number: ");
            int inputNum = input.nextInt(); // 1, 2
            if(inputNum>max) {
                max = inputNum;
            }
        }
        System.out.println("Max value is: "+max);

        System.out.println("=================================================================");

        /*
        Write a program that asks user to enter number 5 times:
          -Find minimum number
         */

        int min=999999999;// you add negative number too int max= -9999999;
        for(int i=1; i<=5; i++) {
            System.out.println("Enter a number: ");
            int inputNum = input.nextInt(); // 1, 2
            if(inputNum<min) {
                min = inputNum;
            }
        }
        System.out.println("Min value is: "+min);




    }
}
