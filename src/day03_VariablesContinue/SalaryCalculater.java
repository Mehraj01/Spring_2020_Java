package day03_VariablesContinue;

public class SalaryCalculater {
    public static void main(String[] args) {


//        Task 08:
//        Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
//        ex:
//        if:
//        rate = 55;
//        stateTax = 0.04;
//        federalTax =0.22;
//        weeklyHours = 40;
//
//        then output will be:
//        your salary is: 105600 USD
//        your total tax is: 27456 USD
//        your income after tax is: 78144 USD
//
//        if:
//        rate = 45.25;
//        stateTax =0.045;
//        federalTax = 0.25;
//        weeklyHours = 45;
//
//        then output will be:
//        your salary is: 91260 USD
//        your total tax is: 26921.7
//        your income after tax: 64338.3 USD


        double hourlyRate=65;
        double stateTaxRate=0.04;
        double federalTaxRate=0.22;
        byte weeklyHours=45;
        byte totalWeeks=48;

        //salary=hourlyRate * weeklyHours* 52 (52 is yearly weeks)

        double salary=hourlyRate*weeklyHours*totalWeeks;
               //total salary before the tax

        //stateTax = salary * stateTaxRate
        double stateTax=salary*stateTaxRate;

        //federalTax=salary*federalTaxRate
        double federalTax=salary*federalTaxRate;


        //salaryAfterTax=salary-stateTax-federalTax;
        double salaryAfterTax=salary-(stateTax+federalTax);


        System.out.println("Your salary is: "+salary);   //concatenation
       /*
        System.out.println("9"+3);  //93, concatenation
        System.out.println(9+3); // 12, addition

        */

        System.out.println("State Tax is: $" +stateTax);

        System.out.println("Federal Tax is: $"+ federalTax);

        System.out.println("Total tax is: $"+(federalTax+stateTax));

        System.out.println("Salary is after tax is: $"+salaryAfterTax);








    }
}
