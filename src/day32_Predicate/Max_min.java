package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Max_min {
    public static void main(String[] args) {


        //finding second max wrong solution...it will return max(10)-1==>9
        /*
        int max2=list.indexOf(Collections.max(list));
        System.out.println(""+list.get(max2-1));

         */


        ArrayList<Integer> nums=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));
        //second max 8
        // second min 2

        Integer maxNum=Collections.max(nums);// it will always return max number from given list
        System.out.println(maxNum);
        nums.removeAll(Arrays.asList(maxNum));// we will remove all max same numbers
        int max2=Collections.max(nums);// we will assign second max number to max2
        System.out.println(max2);


        ArrayList<Integer> list2=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));


        Integer minNum=Collections.min(list2);
        list2.removeAll(Arrays.asList(minNum));
        int min2=Collections.min(list2);
        System.out.println(min2);

    }
}
