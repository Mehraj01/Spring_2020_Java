package day14_StringClass;

import java.util.Scanner;

public class StartEndWords {
    /*
2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
	pre condition: both words must have 5 characteres

 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String word1=input.next();

        System.out.println("Enter second word");
        String word2=input.next();

        int length1=word1.length();
        int length2=word2.length();



        if(length1==5 && length2==5){
            if(word1.charAt(length2-1)==word2.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }


        }else{
            System.out.println("need to be exactly 5 chars length");
        }



    }
}
