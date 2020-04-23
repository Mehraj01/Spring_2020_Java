package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit069_PrintTheLongestWord {
    public static void main(String[] args) {
        /*
        Write a program that will print out the longest word between two words.
         */

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        if(word1.length()>word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }


    }
}
