package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

/*
in this assignment you are given two string variables word1 and word2.
you need to check if they are equal using an if.

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output  "word1 equals word2"
else output "word1 does not equal word2"

for example:
word1="java"
word2="java"

output:
"word1 equals word2"

word1="foo"
word2="bar"

output:
"word1 does not equal word2"
 */
public class Replit035_Words {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter first word");
        String word1=s.next();

        System.out.println("Enter second word");
        String word2=s.next();

        if(word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }


    }
}
