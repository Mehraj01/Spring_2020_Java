package day10_Switch_Scanner;
import java.util.Scanner;
public class number_scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);  //object of scanner

        System.out.println("Enter your first number");
        int num1=scan.nextInt();

        System.out.println("Enter second number");
        int num2=scan.nextInt();

        System.out.println("Enter your third number");
        int num3=scan.nextInt();

        int max=(num1>=num2 && num1>=num3)?num1:(num2>=num1&&num2>=num3)?num2:num3;// max number
        int min=(num1<=num2 && num1<=num3)?num1:(num2<=num1&&num2<=num3)?num2:num3;// minimum number


        System.out.println("maximum number is: "+max);
        System.out.println("minimum number is: "+min);

    }
}

