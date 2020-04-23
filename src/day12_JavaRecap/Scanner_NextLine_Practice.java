package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

        // 7925 Jones Branch Dr, Mclean VA 22034
        // fullAddress: Building-number, Street, city state, zipcode.

        System.out.println("Enter building number: ");
        String Bnumber=input.next();//7925(Enter)

        System.out.println("Building number is: "+Bnumber);

        input.nextLine();//used for taking out the Enter from The Scanner

        System.out.println("Enter Street: ");
        String street=input.nextLine();

        System.out.println("Street is: "+street);

        System.out.println("Enter the zip code: ");
        int zipCode=input.nextInt();

        input.nextLine();//take out the enter

        System.out.println("Enter the city name and sate seperate bye comma and space ");
        String cityState=input.nextLine();

        String fullAddress=Bnumber+" "+street+", "+cityState+" "+zipCode;
        System.out.println(fullAddress);

        input.close();//closes the scanner

    }
}
