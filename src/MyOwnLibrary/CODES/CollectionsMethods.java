package MyOwnLibrary.CODES;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsMethods {
    public static void main(String[] args) {

        /**
         * - Collections.frequency(letters,"A");
         */
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "B", "D") );
        Integer count=Collections.frequency(letters,"A");
        System.out.println(count);



        System.out.println("=========================================================================================");

        /**
         * -> Arrays.sort(myArray, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
         *    Arrays.sort(myArray, Comparator.nullsLast(Comparator.naturalOrder()));
         *    With List: -> Collections.sort(list,Comparator.nullsFirst(Comparator.naturalOrder()));
         */
        String[] myArray = {"JavaFX", null, "OpenCV", null, "Hadoop", null};
        Arrays.sort(myArray, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Arrays.toString(myArray)); // - result -> [Hadoop, JavaFX, OpenCV, null, null, null]

        ArrayList<String>list=new ArrayList<>(Arrays.asList(myArray));
        Collections.sort(list,Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list); // - result -> [null, null, null, Hadoop, JavaFX, OpenCV]


        /**
         * - null: ->  default value of all reference-type (all non-primitives)
         * - does not refer to any objects
         * - it's not instance of anything
         */


        System.out.println("=========================================================================================");

        /**
         * - Collections.synchronizedList(list1);
         */
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list1 = Collections.synchronizedList(list1); // - thread-safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); // - thread-safe

        System.out.println("=========================================================================================");




    }
}
