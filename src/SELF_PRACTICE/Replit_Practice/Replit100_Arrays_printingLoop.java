package SELF_PRACTICE.Replit_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit100_Arrays_printingLoop {
    public static void main(String[] args) {
        /*
        The code provided in your main method will take in five Strings and save them into an array called arr.
        Print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban
         */
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }



        for(int i=0; i<arr.length; i++){
            String result=""+arr[i].charAt(0)+arr[i].charAt(1)+arr[i].charAt(2);
            System.out.println(result);
        }









    }
}
