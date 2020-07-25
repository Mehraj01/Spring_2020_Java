package MyOwnLibrary;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        int a = 1000000;
        int b = 200;
        Calculation(5,5,'*');
        Calculation(30, 40, '+');
        Calculation(15,3,'/');
        int n1 = 10000;
        int n2 = 100;
        Calculation(n1,n2, '/');

        System.out.println("=======================================");

        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter operator: ");
            char operator = scan.next().charAt(0);
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();

            Calculation(num1, num2, operator);  // result of calculation
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("No")){
                break;
            }
        }

        System.out.println("=======================================");

        Age(1986);



    }
//System.out.println("===============================================================================================");

      //                                     10           20           *
        public static void Calculation(double num1, double num2, char operator){


            switch (operator){
                case '+':
                    System.out.println(num1+num2);
                    break;

                case '-':
                    System.out.println(num1-num2);
                    break;

                case '*':
                    System.out.println(num1*num2);
                    break;

                case '/':
                    System.out.println(num1/num2);
                    break;

                case '%':
                    System.out.println(num1%num2);
                    break;

                default:
                    System.out.println("Invalid");

            }


        }
//System.out.println("===============================================================================================");

    public static void Age(int birthYear){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear=scan.nextInt();
        int age=currentYear-birthYear;

        if(age>0 && birthYear>1900) {
            System.out.println(age);
        }else{
            System.out.println("Invalid birth year");
        }
    }
//System.out.println("===============================================================================================");


}
