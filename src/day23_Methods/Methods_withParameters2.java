package day23_Methods;

import java.util.Arrays;

public class Methods_withParameters2 {
    public static void main(String[] args) {
        String name="Sada";
        reverseString(name);
        int []number={1,2,3};
        decendingOrder(number);
        int []number2={1,2,3,4,5,6,7,8,9};
        decendingOrder(number2);
    }


    public static void reverseString(String str){

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }


    public static void decendingOrder(int num[]){


        for(int i=num.length-1; i>=0; i--){
            int dec=num[i];

            System.out.print(dec);
        }
        System.out.println();

    }


}
