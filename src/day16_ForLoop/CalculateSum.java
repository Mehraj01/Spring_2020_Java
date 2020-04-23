package day16_ForLoop;

import java.util.Scanner;

/*
7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
 */
public class CalculateSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=input.nextInt(); //input for exp: 100
        int result=0;//if you put int in the loop, loop will declare the sum variable over and over again...

        for (int i=1; i<=num; i++){
            result+=i;
        }
        System.out.println(result);


    }
}
