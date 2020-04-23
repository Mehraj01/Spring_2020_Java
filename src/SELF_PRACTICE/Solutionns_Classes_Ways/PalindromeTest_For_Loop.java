package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class PalindromeTest_For_Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your words");
        String word=input.nextLine();

        String reverseWord="";

        for(int i=word.length()-1; i>=0;i--){
            reverseWord+=word.charAt(i);

        }
        System.out.println(reverseWord);

        boolean palindrome=word.equalsIgnoreCase(reverseWord);// check its palindrome or not
        System.out.println(palindrome);

    }
}
