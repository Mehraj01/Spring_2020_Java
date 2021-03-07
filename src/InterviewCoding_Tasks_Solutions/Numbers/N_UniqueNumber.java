package InterviewCoding_Tasks_Solutions.Numbers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class N_UniqueNumber {

    public static void main(String[] args) {

       // int[] result = {1,2,3};
        int[] result= N_Number(3);
        System.out.println(Arrays.toString(result));

    }





    public static int []N_Number(int N) {

        int[] result = new int[N];
        int sum = 0;
        for(int i=0; i < N-1; i++) {
            result[i] =i;
            sum += i;
        }
        result[N-1] = -sum;
        return result;

    }



}
