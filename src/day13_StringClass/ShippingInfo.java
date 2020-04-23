package day13_StringClass;

import java.util.Scanner;

/*
       2. write a program for the shipping info that, the program should ask:
                   building number
                   Street address (Assume it has more than one word)
                   city name
                   state name
                   zip code
                   full name of the person:
           and prints the ship to info in the following format:
           ex output:
                   Ship To:  Jimmy joe
                             7925 Jones Branch Dr
                             MCLean, VA 22102
        */
public class ShippingInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNum=input.next();//112A Enter

        input.nextLine();

        System.out.println("Enter your street address");
        String Street=input.nextLine();

        System.out.println("Enter your city name");
        String cityName=input.nextLine();

        System.out.println("Enter your State");
        String state=input.nextLine();

        System.out.println("Enter your zip code");
        String zipCode=input.next();

        input.nextLine();

        System.out.println("Enter Full name");
        String fullName=input.nextLine();

        String result="Ship to: "+fullName+"\n\t\t"+buildingNum+" "+Street+"\n\t\t"+cityName+", "+state+" "+zipCode;

        System.out.println(result);







    }
}
