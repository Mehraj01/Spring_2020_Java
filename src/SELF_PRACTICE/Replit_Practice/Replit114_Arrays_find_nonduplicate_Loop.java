package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit114_Arrays_find_nonduplicate_Loop {
    public static void main(String[] args) {
        /*
        Given an array nums with 7 integers every element is repeated twice - except one.
        Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2


         */

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count=0;
        for(int i=0; i<7; i++){
            count=0;
            for(int j=0; j<7; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count!=2){
                System.out.println(nums[i]);
            }
        }


    }
}
