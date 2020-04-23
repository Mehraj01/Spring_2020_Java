package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit059_firstLast_character {
    public static void main(String[] args) {
        /*
       - Write a program that will print out first character of the word.
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstCharacter=word.substring(0,1);
        System.out.println(firstCharacter);

        /*
        -Write a program that will print out last letter of the word (string).
         */

        String lastCharacter=word.substring(word.length()-1);
        System.out.println(lastCharacter);

    }
}
