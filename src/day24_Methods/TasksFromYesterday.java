package day24_Methods;

import java.util.Arrays;

/*
4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */
public class TasksFromYesterday {
    public static void main(String[] args) {
        int []arr={10,5,9,6,4,7,2,1};
        int[]num={100, 300, 200, 25, 700, 50,400};
        MaxNumber(arr);// if the parameter is Array, the argument have to be array.
        MinNumber(arr);
        Descending(arr);
        MaxNumber(num);


    }

    public static void Descending(int[]array){
        Arrays.sort(array);
        for(int i=array.length-1; i>0; i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


public static void MinNumber(int []arr){
        Arrays.sort(arr);

    System.out.println("Minimum number is: "+arr[0]);
}



    public static void MaxNumber(int[] array){
       // Arrays.sort(array);// it will sort the numbers by ascending order
        //System.out.println("Add Maximum number: "+array[array.length-1]);


        //soluton2
        int lastindex=array.length-1;

        int max=array[0];

        for( int i=0; i<=lastindex; i++ ){

            if(array[i]>=max){
                max=array[i];
            }
        }
        System.out.println("Add Maximum number: "+max);


    }











}
