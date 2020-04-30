package WarmupTasks;

import java.util.ArrayList;

public class ArrayList_Uniques {
    public static void main(String[] args) {
        /*
        3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
         */

        int[]nums={1,2,3,4,5,6,6,1,2,4,};
        ArrayList<Integer> unique = new ArrayList<>();



        for(int k=0; k<nums.length; k++) {
            int count = 0;

            for(int i=0; i<nums.length; i++) { // second for loop and second if statement will be inside the first loop
                if (nums[i] == nums[k]) { // index number i and k is the same indexes which we are comparing to get the uniques
                    count++;
                }
            }

            if(count==1){ // this if statement will be inside the first loop only!!! Always check your curly braces
                unique.add(nums[k]);
            }

        }

        System.out.println(unique);
    }

}



