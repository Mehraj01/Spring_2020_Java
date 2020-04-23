package day24_Methods;

import java.util.Scanner;

public class BirthYears {
    public static void main(String[] args) {

         printHelloWorld();// Hello World

        Age(1986);

    }


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



    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printWorld(){
        System.out.println("World");
    }
    public static void printHelloWorld(){
        printHello();
        printWorld();
    }





}
