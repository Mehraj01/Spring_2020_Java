package InterviewCoding_Tasks_Solutions.Arrays;

import java.util.Arrays;

public class Find_Maximum {
    public static void main(String[] args) {

        int arr[]={1,6,0,50, 20, 100};
        System.out.println(maxValue(arr)); //method 1

        System.out.println(maxValue2(arr));// method 2

        System.out.println(maxValue3(arr));// method 3

    }

//System.out.println("===============================================================================================");
    public static int maxValue(int[]n){

        int max=n[0];

        for(int i=0; i<=n.length-1; i++ ){
            if(n[i]>=max){
                max=n[i];
            }
        }

        return max;
    }
//System.out.println("===============================================================================================");

    public static int maxValue2(int[]n){

        int max=Integer.MIN_VALUE;

        for(int each: n){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
//System.out.println("===============================================================================================");

public static int maxValue3(int[]n){

              Arrays.sort(n);
                return n[n.length-1];

}
//System.out.println("===============================================================================================");








}
