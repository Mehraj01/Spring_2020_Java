package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit087_Has_Java_Loop_String {
    public static void main(String[] args) {
        /*
        Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
        such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
         */

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //int word1=word.indexOf(0,1);

       String word1=word.substring(1);

        if(word.startsWith("j")){
            System.out.println("true");
        }else if(word1.startsWith("j")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }









    }
}
