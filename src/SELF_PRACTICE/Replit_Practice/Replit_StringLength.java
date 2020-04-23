package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit_StringLength {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();

        int length=name.length();
        System.out.println(length);


    }
}
