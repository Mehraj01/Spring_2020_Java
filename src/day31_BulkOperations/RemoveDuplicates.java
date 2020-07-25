package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class RemoveDuplicates {
    public static void main(String[] args) {
          /*
             1. write a program that can remove duplicates from an arraylist
         */

        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("Mars", "Neptune", "Earth", "Venus", "Mars", "Venus", "Neptune"));

        ArrayList<String> unique=new ArrayList<>();
        //System.out.println(unique);

        for(int i=0; i<list.size()-1; i++){
            if(!unique.contains(list.get(i))){
                unique.add(list.get(i));

            }
        }
        System.out.println(unique);





    }
}
