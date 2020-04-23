package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit075_X_x {
    public static void main(String[] args) {
        /*
        Given a string word, if the first or last chars are 'x' or 'X',
        print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";

        if(word.startsWith("x")&&word.endsWith("x")){
            result=word.substring(1,word.length()-1);
        }else if(word.startsWith("X")&&word.endsWith("X")){
            result=word.substring(1,word.length()-1);
        }
        else{
            result=word;
        }
        System.out.println(result);

    }
}

