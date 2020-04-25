package SELF_PRACTICE.Replit_Practice;

import java.util.Arrays;
import java.util.Scanner;

/*
add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */
public class Replit149_Add_toARRAY {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }



    public static void add_to_r(int[] r,int n) {

        int[] arr3 = new int[r.length+1];


        for(int i = 0; i <r.length ; i++ ){
            arr3[i] =  r[i];
        }

        for(int i= 0; i <arr3.length; i++ ){
            arr3[arr3.length-1]=n;
        }

        System.out.println( Arrays.toString(arr3)  );

/*
        int [] Array = new int [r.length+1];
        for (int i =0; i < r.length; i++) {
            Array[i] = r[i];
        }
        Array[Array.length -1 ] = n;

        System.out.println(Arrays.toString(Array));

 */







    }


    }
