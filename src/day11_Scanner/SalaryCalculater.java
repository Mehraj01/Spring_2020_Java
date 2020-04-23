package day11_Scanner;

import java.util.Scanner;

public class SalaryCalculater {

    public static void main(String[] args) {
        /*
        2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
         */

        Scanner input=new Scanner(System.in); // Scanner object

        System.out.println("Enter your salary: ");
        int salary=input.nextInt();

        System.out.println("Enter state tax: ");
        byte stateTax=input.nextByte();
        double stateTaxPercentage=stateTax/100.0;

        System.out.println("Enter your federal tax: ");
        byte federalTax=input.nextByte();
        double federalTaxPercentage=federalTax/100;//10/3.0==>3.333

        //totalTax=(federalTaxPercentage+stateTaxPercentage)*salary
        double totalTax=(federalTaxPercentage+stateTaxPercentage)*salary;

        //salaryAfterTax=salary=totalTax
        double salaryAfterTax=salary-totalTax;
        System.out.println("Your salary after tax is: $"+salaryAfterTax);
        System.out.println("Total tax is: $"+totalTax);





    }
}
