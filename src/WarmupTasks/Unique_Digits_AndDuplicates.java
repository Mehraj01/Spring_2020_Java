package WarmupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Unique_Digits_AndDuplicates {
    public static void main(String[] args) {
/*
1. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};

 */

        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        System.out.println(nums);

        Predicate<Integer> unique= A -> Collections.frequency(nums, A)>1;
        nums.removeIf(unique);
        System.out.println(nums);



        /*
        2. write a program that can return the duplicated objects from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};

         */


       ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer> Duplicate = X -> Collections.frequency(numbers, X)==1;


        numbers.removeIf(Duplicate);
        System.out.println(numbers);






    }
}
