package day23_Methods;

import java.util.Scanner;

public class Methods_withParameters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextByte();

        EligibleBuy(age);
    }


    public static void EligibleBuy(int age ){

        if(age>=21){
            System.out.println("Eligible to buy alchocol");
        }else{
            System.out.println("Eligible tobuy milk");
        }
    }






}
