package SELF_PRACTICE.Replit_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit105_Print_FirstLastChar_Array {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print first and last letter of each element
        in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

         */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String result[]=new String[words.length];
        for(int i=0; i<words.length;i++){
            result[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
        }
        System.out.print(Arrays.toString(result));




    }
}
