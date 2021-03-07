package MyOwnLibrary.CODES;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {


        /**
         * - 1. Write a program that can REMOVE THE DUPLICATES for arraylist and print out in SORTED ASC ORDER
         * -> TreeSet -> Remove Duplicates and Sort ASC order
         * -> TreeSet does not accepts null
         */
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
        nums=new ArrayList<>(new TreeSet<>(nums));
        System.out.println(nums);

        String str1 = "babababC";
        str1 = new TreeSet<>( Arrays.asList(str1.split("")) ).toString();
        System.out.println(str1);


        System.out.println("=========================================================================================");

        /**
         * - 2. Write a program that can REMOVE THE DUPLICATES from an ArrayList. DO NOT change the ORDER
         * -> LinkedHashSet -> Remove Duplicates and Keeps the Insertion Order
         */
        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));
        list=new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);


        /**
         * - 1. Write a program that can remove the duplicated characters from String and store them into variable
         */
        String str = "ABABABCDEF";
        String[] arr = str.split("");
        str = new LinkedHashSet<>(Arrays.asList(arr)).toString().replace(", ", "");
        System.out.println(str);


        System.out.println("=========================================================================================");

        /**
         * -> Does not accept duplicates, and sort the objects
         * -> HashSet accepts null
         * -> HashSet is faster than TreeSet
         */
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6, 1));
        System.out.println(numbers ); // -> [1, 5, 6, 7, 8, 9, 10]


        System.out.println("=========================================================================================");

        /**
         * - ITERATOR: -> is the only way to remove duplicates from collection
         * - removeIf -> removes numbers because it is uses the iterator interface internally. Iterator implicitly
         *
         * - hasNext() method only can go forward cant go backward. it stars from next index
         * - when we use it our loop hasNext() iterates from the next index
         * - iterator(); - hasNext(); - next(); - remove();
         */
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        list2.removeIf( p -> p < 4 );
        System.out.println(list2);


        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        Iterator<Integer>  it =list3.iterator(); // - this method will return iterator
        while( it.hasNext() ){ // -  iterator explicitly. While loop only accept boolean
            if( it.next()  < 4 ){
                it.remove();
            }
        }
        System.out.println(list3);


        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,4,5,5));
        // - hasNext(); will iterate all the indexes. We do not need extra iterator in the loop
        for(Iterator<Integer> I = list4.iterator(); I.hasNext();  ){
            if( I.next() < 4) {
                I.remove();
            }
        }
        System.out.println(list4);



        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Mehmet","Mohammed","Yucel","Sha","Ozgur", "Ahmet","Osmanj","Ozgur","Ozgur","Irina"));
        System.out.println(names);
        Iterator<String> it3 = names.iterator();
        while( it3.hasNext() ){
            String s = it3.next();
            if(s.contains("m") || s.contains("M")){ // - s.toLowerCase.contains("m")
                it3.remove();
            }
        }
        System.out.println(names);

        /*
        ===============================================================
         for(Iterator<String> it3 = names.iterator(); it3.hasNext() ;  ){
            String s = it3.next();
            if(s.toLowerCase().contains("m")){
                it3.remove();
            }
        }
         ================================================================
         names.removeIf( s -> s.contains("m") || s.contains("M") );
         ================================================================
         names.removeAll( Arrays.asList( "Mehmet", "Ozgur", "Mohammed" ));
         ================================================================
         names.retainAll( Arrays.asList( "Yucel", "Sha", "Ahmet" ) );
         ================================================================
         boolean result = list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ));
         */







        System.out.println("=========================================================================================");





    }
}

