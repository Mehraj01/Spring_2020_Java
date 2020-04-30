package WarmupTasks;

import java.util.ArrayList;

public class ArrayList_Unique_Inside_ArrayList {
    public static void main(String[] args) {
        /*
        	  4.	write a program that can find the unique elements from an ArrayList of integers and
        	  stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
}
         */

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        ArrayList<Integer> unique = new ArrayList<>();

        for(int k=0; k<nums.size(); k++) {
            int count = 0;

            for(int i=0; i<nums.size(); i++) { // second for loop and second if statement will be inside the first loop
                if (nums.get(i) == nums.get(k)) {
                    count++;
                }
            }

            if(count==1){ // this if statement will be inside the first loop only!!! Always check your curly braces
                unique.add(nums.get(k));
            }

        }

            System.out.println(unique);
        }

    }
