package InterviewCoding_Tasks_Solutions.Arrays;

import java.util.Arrays;

public class Find_Minimum {
    public static void main(String[] args) {

        int arr[]={1,6,0,50, 20, 100};
        System.out.println(minValue(arr)); //method 1

        System.out.println(minValue2(arr)); //method 2

        System.out.println(minValue3(arr)); //method 3

    }

    //System.out.println("===============================================================================================");
    public static int minValue(int []n){

        int min=Integer.MAX_VALUE;

        for(int each: n){
            if(each<min){
                min=each;
            }
        }
        return min;

    }
//System.out.println("===============================================================================================");

    public static int minValue2(int []n){

        Arrays.sort(n);
        return n[0];


    }
//System.out.println("===============================================================================================");

    public static int minValue3(int []n){


        int min=n[0];

        for(int i=0; i<=n.length-1;i++){
            if(n[i]<=min){
                min=n[i];
            }
        }
        return min;
    }
//System.out.println("===============================================================================================");

}
