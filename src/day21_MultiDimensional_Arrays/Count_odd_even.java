package day21_MultiDimensional_Arrays;

public class Count_odd_even {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,6,7,8,9,10};

        int countOdd=0;
        int countEven=0;

        for(int each:arr){
            /*if(each%2!=0){
                countOdd++;
            }else{
                countEven++;
            }

             */

            if(each%2!=0){
                countOdd++;
                continue;
            }
            countEven++;
        }
        System.out.println(countOdd);
        System.out.println(countEven);



    }
}
