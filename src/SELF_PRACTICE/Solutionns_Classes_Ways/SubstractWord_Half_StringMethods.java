package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;
import java.util.Scanner;
public class SubstractWord_Half_StringMethods {

    public static void main(String[] args) {
        /*
        Write a program that will print out first half of the word twice.

                Example:

        input: java
        output: jaja
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        word = word.substring(0, word.length() / 2);
        System.out.println(word + word);

    }
}