package SELF_PRACTICE.Replit_Practice;
/*
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */

import java.util.Scanner;

public class Replit090_CountJava_Loop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        word=word.toLowerCase();

        int countJava=0;

        for(int i=0; i<word.length(); i++){

            if(word.contains("java")){
                word=word.replaceFirst("java", "");
                countJava++;
            }
        }
        System.out.println(countJava);




    }
}
