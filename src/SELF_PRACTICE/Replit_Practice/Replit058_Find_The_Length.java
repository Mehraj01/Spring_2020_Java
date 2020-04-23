package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit058_Find_The_Length {
    public static void main(String[] args) {
        /*
        Example:
          Display message: "Please enter the text:"
          input: java
          Display message: "Length is: 4"
         */
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=in.nextLine();

        int length=text.length();
        System.out.println("Length is: "+length);


    }
}


