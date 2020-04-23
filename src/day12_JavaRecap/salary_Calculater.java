package day12_JavaRecap;

import java.util.Scanner;
import java.util.SortedMap;

public class salary_Calculater {
    /*
    Ask the user enter salary
    ask the user enter the full name
    ask the user the enter the company name
    ask the user to enter SSN
    ask the user to enter JobTitle
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary =input.nextDouble();//10000

        input.nextLine();

        System.out.println("Enter the full name: ");
        String fullName=input.nextLine();

        System.out.println("Enter the company name: ");
        String companyName=input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN=input.nextLong();///12345Enter

        input.nextLine();

        System.out.println("Enter job title: ");
        String jobTitle=input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job title is: "+jobTitle);
        System.out.println("Company name: "+companyName);
        System.out.println("SNN "+SSN);
        System.out.println("Salary is: $"+salary);




    }
}
