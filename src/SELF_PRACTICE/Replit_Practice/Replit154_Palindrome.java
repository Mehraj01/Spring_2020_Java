package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit154_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE



        for(int i=num; i>0; i--){
           int reverse=num;
            System.out.println(reverse==num);
        }


    }
}
