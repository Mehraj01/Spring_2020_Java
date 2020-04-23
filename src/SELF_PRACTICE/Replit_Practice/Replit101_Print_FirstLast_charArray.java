package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit101_Print_FirstLast_charArray {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print first and last letter
        of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

         */

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for(int i=0; i<words.length; i++){
            String result=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
            System.out.println(result);
        }





    }
}
