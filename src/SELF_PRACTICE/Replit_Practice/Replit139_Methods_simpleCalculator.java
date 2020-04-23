package SELF_PRACTICE.Replit_Practice;
/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */

import java.util.Scanner;

public class Replit139_Methods_simpleCalculator {

    public static void main(String[] args) {

        plus();
    }

    public static void plus(){
        Scanner input=new Scanner(System.in);

        System.out.println("enter first number:");
        int num1=input.nextInt();
        System.out.println("enter second number:");
        int num2=input.nextInt();
        int calculater=num1+num2;
        System.out.println("result: "+calculater);


    }


}
