package SELF_PRACTICE.Replit_Practice;
import java.util.*;
public class Replit035_GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();

        if(item.equalsIgnoreCase("Smartphone")||item.equalsIgnoreCase("laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equalsIgnoreCase("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-15)+" $");
        }else if(item.equalsIgnoreCase("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-10)+" $");
        }else if(item.equalsIgnoreCase("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-30)+" $");
        }else if(item.equalsIgnoreCase("Pants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 50) + " $");
        }else if(item.equalsIgnoreCase("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 25) + " $");
        }else if(item.equalsIgnoreCase("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 5) + " $");
        }else if(item.equalsIgnoreCase("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 60) + " $");
        }else if(item.equalsIgnoreCase("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 40) + " $");
        }else{
            System.out.println("Invalid item!");
        }




    }
}
