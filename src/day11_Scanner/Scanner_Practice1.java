package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        /*
        Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employee status:
        salary:
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Entered first name: ");
        String firstName=scan.next();
        //System.out.println(firstName);

        System.out.println("Enter your last name: ");;
        String lastName=scan.next();
        String fullName=firstName+" "+lastName;

        System.out.println("Are you employed? ");
        boolean empStatus=scan.nextBoolean();

        double salary=0;
        if(empStatus==true){
            System.out.println("Enter your salary: ");
            salary=scan.nextDouble();
        }else{
            salary=0;
        }

        System.out.println("Full name is: "+fullName);
        System.out.println("Employeed: "+empStatus);
        System.out.println("salary: "+salary);






    }
}
