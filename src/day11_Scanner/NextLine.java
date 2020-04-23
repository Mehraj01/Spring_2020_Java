package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the full name: ");
        String fullName=input.nextLine();// nextLine method accepts the "Enter"
        System.out.println("Your full name is: "+fullName);



        System.out.println("Enter your word: ");
        String word=input.nextLine();
        System.out.println("You entered: "+word);



    }
}
