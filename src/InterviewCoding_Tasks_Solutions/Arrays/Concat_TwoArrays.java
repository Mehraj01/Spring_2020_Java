package InterviewCoding_Tasks_Solutions.Arrays;

import java.util.Arrays;

public class Concat_TwoArrays {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        int[] arr2 = {13, 10, 15, 7};

        System.out.println(Arrays.toString(concatTwoArrays(arr, arr2)));

        System.out.println(Arrays.toString(concatTwoArrays2(arr, arr2)));


    }
//System.out.println("===============================================================================================");

    public static int []concatTwoArrays(int arr1[], int arr2[]){

        int []Array=new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length; i++){
            Array[i]=arr1[i];
        }

        for(int i=0; i<arr2.length; i++){
            Array[arr1.length+i]=arr2[i];
        }
        return Array;

    }
//System.out.println("===============================================================================================");
    public static int []concatTwoArrays2(int arr1[], int arr2[]){

        int []Array=new int[arr1.length+arr2.length];

        int i=0;
        for(int each: arr1){
            Array[i]=each;
            i++;
        }

        for(int each: arr2){
            Array[i]=each;
            i++;
        }
        return Array;

    }
//System.out.println("===============================================================================================");


}
