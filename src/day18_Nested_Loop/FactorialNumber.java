package day18_Nested_Loop;

import java.util.Scanner;

/*
2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a number");
        long num  =  scan.nextLong();  // 0
        long result = 1; // 120

        while(num >= 1){
            // result *= num;
            result = result * num;

            num--;
        }

        System.out.println(result);









    }
}
