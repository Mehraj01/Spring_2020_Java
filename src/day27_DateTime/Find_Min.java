package day27_DateTime;
/*
  1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
                    NOTE: apply method overloading,  DO NOT USE SORT METHOD.

 */

import java.util.Arrays;

public class Find_Min {
    public static void main(String[] args) {
        int[] arr ={10, 6, 3, 200, 1000};
        int minimum=min_numbers(arr);
        System.out.println(minimum);
      double minimum2= min_numbers(arr);
        System.out.println(minimum2);



    }

    public static int min_numbers(int[] num){

        int min=num[0];
        for(int i=0; i<num.length; i++){
           if(num[i]<min){
               min=num[i];
           }
        }
        return min;

    }

    public static double min_numbers(double []num){

        double min=num[0];
        for(double i=0; i<num.length; i++){
            if(num[(int) i]<min){
                min=num[(int) i];
            }
        }
        return min;





    }

}
