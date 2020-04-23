package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit056_LaptopConfigurator {
    public static void main(String[] args) {
        /*
        Write a program that will calculate laptop price based on the components.

        First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price.
        If screen size is equals to  15.0 - add  $300 to the laptop price.
        If screen size is equals to  17.3 - add  $400 to the laptop price.  Then ask user for CPU type.
        If CPU type equals to i3, add  $150 to the laptop price. If CPU type equals to i5, add  $250 to the laptop price.
        If CPU type equals to i7, add  $350 to the laptop price.

        Then ask user for RAM size.
        Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type.

        There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.
        If it's SSD - add $100 to the laptop price for every 500GB.

        Then ask user for for screen resolution.
        There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
         */

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screensize = scan.nextDouble();

        if (screensize == 13.3) {
            price+=200;
        } else if (screensize == 15.0) {
            price+=300;
        } else if (screensize == 17.3) {
            price+=400;
        }

        System.out.println("Select CPU type:");
        String CPU = scan.next();

        if (CPU.equalsIgnoreCase("i3")) {
            price += 150;
        } else if (CPU.equalsIgnoreCase("i5")) {
            price +=250;
        } else if (CPU.equalsIgnoreCase("i7")) {
            price +=350;
        }

        System.out.println("Select RAM size:");
        int RAM = scan.nextInt();
            int ramp=RAM/4*50;
            price+=ramp;
        //Add $50 for every 4GB of ram to the laptop price.

                System.out.println("Select storage type:");
        String storage = scan.next();



        System.out.println("Enter memory size:");
        int memory = scan.nextInt();

        if (storage.equalsIgnoreCase("HDD")) {
            int hdd=memory/500*50;
            price+=hdd;
        } else if (storage.equalsIgnoreCase("SSD")) {
            int sdd=memory/500*100;
            price+=sdd;
        }


        System.out.println("Enter screen resolution:");
        String resolution = scan.next();


        if (resolution.equalsIgnoreCase("FULLHD")) {
                price +=100;
        } else if (resolution.equalsIgnoreCase("4K")) {
                price +=200;
        }
        System.out.println("Laptop price is: $"+price);



        }
    }
