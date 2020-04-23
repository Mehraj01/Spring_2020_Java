package SELF_PRACTICE.TRASH;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitPractice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }







    }

    public static void isPos(int num)
    {
        if(num>=1){
            System.out.println("positive");
        }else if(num<1){
            System.out.println("not positive");
        }


    }



}