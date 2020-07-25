package day53_Iterable_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Collection {
    public static void main(String[] args) {

        // iterator only way to remove duplicates from collection
        // when we need to remove object from any collection type we should use iterators

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for(int i=0; i < list.size(); i++){// this loop dosent use iterator at all
            if( list.get(i) < 4){          // Even this method logically correct it will not remove nums from list
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("=========================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        list2.removeIf( p -> p < 4  ); // removeIf removes numbers because it is uses the iterator interface internally
        System.out.println(list2);       // iterator implicitly

        System.out.println("=================================");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        Iterator<Integer>  it =list3.iterator();// this method will return iterator

        //  System.out.println(it.hasNext());
        //  System.out.println(it.next()); // when we use it our loop hasNext() iterates from the next index

        // hasNext() method only can co forward cant go backward. it stars from next index.
        while( it.hasNext() ){ // iterator explicitly// use hasNext method only on time
            if( it.next()  < 4 ){ // while loop only accept boolean
                it.remove();
            }
        }
        System.out.println(list3);

        System.out.println("=================================");
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,4,5,5));


        for(Iterator<Integer> I = list4.iterator(); I.hasNext();  ){ // hasNext(); will iterate all the indexes
            if( I.next() < 4) {                                      // we dont need extra iterator in the loop
                I.remove();
            }
        }

        System.out.println(list4);

    }

}
