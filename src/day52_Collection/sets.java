package day52_Collection;

import java.util.*;
/*

==> Iterable(I): root interface. super-type of all interfaces in collections framework.
     ==> Collection (I):  ==> extended by by List(I), Set(I), Queue(I)

//Set(I): does not accept duplicates. does not have index number, size is dynamic

 >>>> - Set(I) - extends classes ==>  HashSet vs LinkedHashSet:
                  // - linkedHashSet keeps the insertion order as it is
                  // - HashSet is faster than LinkedHashSet


 >>>> - Set is extended by SortedSet(I): sorted set is implemented ==> by TreeSet
				// TreeSet(C): does not accept duplicates, and sort the objects
				//TreeSet does not accept null

	        // HashSet vs TreeSet:
				 - HashSet accepts null, TreeSet does not accept null
				 - HashSet is faster than TreeSet

 */
public class sets {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        // does not accept duplicates ==> It will print one Ozgur only
        // does not have index number
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);

        String[] arr = {"A", "A", "C", "B", "A"}; // ACB
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // [A,C, B]

        System.out.println(set1);

        //  System.out.println( set1.get(1) );

        System.out.println("=========================================");

        // TreeSet(C): does not accept duplicates, and sort the objects
        // TreeSet does not accept null
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll( Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6));

        System.out.println(numbers);

        System.out.println("==========================");


       //does not accept duplicates, and sort the objects
        //HashSet accepts null
        //HashSet is faster than TreeSet
        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.addAll( Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6));
        System.out.println(numbers2);


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset);









    }

}
