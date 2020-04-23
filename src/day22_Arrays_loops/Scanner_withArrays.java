package day22_Arrays_loops;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_withArrays {
    public static void main(String[] args) {
        /*
            Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
             Array,Scanner, for loop, for each loop, substring
         */
        Scanner scan=new Scanner(System.in);
        String []arr=new String[3];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter your numbers:");
            arr[i]=scan.nextLine();
        }
        //System.out.println(Arrays.toString(arr));

        for(String each : arr){
            //String str=each.substring(0, 2+1);// Print first 3 letter of the word
           // System.out.println(str);
            //String str1=each.charAt(0)+""+each.charAt(each.length()-1);//print first and last number
            //System.out.println(str1);
            String str2=each.substring(each.length()/2-1, each.length()/2+2);//middle 3 letter
            System.out.println(str2);

        }





    }
}
