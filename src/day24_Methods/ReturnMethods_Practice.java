package day24_Methods;

import java.util.Arrays;

public class ReturnMethods_Practice {
    /*
    4. creata a function that can print the maximum number from any given array

     */
    public static void main(String[] args) {
        int[] arr = {9,8,7,100,200,50, 40};
        int max=MaxNum(arr);
        System.out.println(max);


        int min=MinNum(arr);
        System.out.println(min);
    }



    public static int MaxNum(int[]arr){

        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int MinNum(int[]arr){
        Arrays.sort(arr);
        return arr[0];
    }

}
