package SELF_PRACTICE.TRASH;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_loop_114 {
    public static void main(String[] args) {
        //replit 114


                Scanner input = new Scanner(System.in);
                int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
                        input.nextInt(),input.nextInt(),input.nextInt()};
                //TODO: write your
                int count=0;
                for( int i=0; i<=nums.length-1; i++) {
                    count=0;
                    for (int j=0; j<=nums.length-1; j++) {
                        if (nums[j] == nums[i]) {
                            count++;
                        }
                    } if (count!=2){
                        System.out.println(nums[i]);
                    }
                }

       // int count=0;
        for(int i=0; i<7; i++) {
            count = 0;
            for (int j = 0; j < 7; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count != 2) {
                System.out.println(nums[i]);
            }


        }


        Arrays.sort(nums);
        String Unique="";
       // int count=0;
        for (int i=0; i<=nums.length-1; i++) {
            count = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[j]== nums[i]) {
                    count++;
                }
            }
            if(count==1){
                Unique+=nums[i];
            }
        }
        System.out.println(Unique);

    }

}
