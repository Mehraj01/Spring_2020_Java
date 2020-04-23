package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

/*
Given method called cube. Write all required code inside this method in order  to asks the user for a number
and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */
public class Replit141_Methods_findCube {

    public static void cube(int n)
    {
        int cubeNum=n*n*n;
        System.out.println(cubeNum);

    }//end cube

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        cube(number);


    }



}
