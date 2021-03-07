package Practice_2021;

import java.util.Scanner;
import java.util.SortedSet;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day os the week");
        int num=scanner.nextInt();
        String result="";
        switch (num){
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            default:
                result="There is no day";
        }
        System.out.println(result);











    }
}
