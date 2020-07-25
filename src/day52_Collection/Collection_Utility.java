package day52_Collection;

import java.util.*;

public class Collection_Utility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,9,8,7,6,5,4) );
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("===================================");
        //     1. write a program that can remove the duplicates for arraylist and print out in sorted asc order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
        //1,2,3,4,5,6,7
        nums = new ArrayList<>(  new TreeSet<>(nums) ); //TreeSet Sort an object automaticaly

        System.out.println(nums);

        System.out.println("====================================");

        // 2. write a program that can removed the duplicates from an ArrayList. DO NOT change the order
        //   [6,6,6,6,5,5,5,4,4,4,4] ==> [6,5,4]

        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));
        list = new ArrayList<>(  new LinkedHashSet<>(list)  );//LinkedHashSet keeps the insertion order as it is
        System.out.println(list);                             // LinkedHashSet dosent accepts duplicates


        System.out.println("==================================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll( Arrays.asList("A", "B", "C", "B", "D") );

        boolean result = Collections.frequency(letters, "A") == 1;

        System.out.println(result);




    }
}
