package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethods {


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,7,9));


        int max=Collections.max(list);
        System.out.println(max-2);

        int min=Collections.min(list);
        System.out.println(min);



        System.out.println("=========================================");


          //finding second max
        /*
        int max2=list.indexOf(Collections.max(list));
        System.out.println(""+list.get(max2-1));

         */


        ArrayList<Integer> nums=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));
        //second max 8
        // second min 2

        Integer maxNum=Collections.max(nums);// it will always return max number from given list
        nums.removeAll(Arrays.asList(maxNum));// we will remove all max same numbers
        int max2=Collections.max(nums);// we will assign second max number to max2
        System.out.println(max2);


        ArrayList<Integer> list2=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));


        Integer minNum=Collections.min(list2);
        list2.removeAll(Arrays.asList(minNum));
        int min2=Collections.min(list2);
        System.out.println(min2);


        System.out.println("================================================================");

        //Collections.swap();  // it will swap 2 indexes


        ArrayList<Integer> list3=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));

        Collections.swap(list3,0,4);// it swap index and idex 4.// Resul will be: 5,3,2,4,1,10,6,9,8
        System.out.println(list3);

        System.out.println("========================================================================");

        //Collections.replaceAll();

        ArrayList<String> planets=new ArrayList<>( Arrays.asList("Mars","Moon", "Venus", "Moon","Earth", "Moon"));

        planets.set(0,"Pluto");
        System.out.println(planets);

        Collections.replaceAll(planets, "Moon","Uranus");
        System.out.println(planets);










    }
}
