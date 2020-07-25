package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Duplicates {
    public static void main(String[] args) {
        /*
        write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
         */
        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String>Duplicate=new ArrayList<>();

        //list.get(0); ==>"A"
        for(int s=0; s<list.size();s++){//second loop will repeat equals(list.get(s))


            int count=0;
            for(int i=0; i<list.size();i++){
                if(list.get(i).equals(list.get(s))){//If list.get(i) == equals(list.get(s)each index of the list 1,2,3,4
                    count++;//count the the duplicates
                }
            }
            if(count>1&& !Duplicate.contains(list.get(s))){//if count greater than 1 and if its not contained duplicate yet, then will add the object to the lsit
                Duplicate.add(list.get(s));// the dupplicate+
            }



        }
        System.out.println(Duplicate);

        System.out.println("==================================================================================");

      //way with Collections.frequency()

        ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(words);

        ArrayList<String>result=new ArrayList<>();

        for(int i=0; i<words.size(); i++){
            int count= Collections.frequency(words,list.get(i));
            if(count>1&& !result.contains(list.get(i))){
                result.add(list.get(i));
            }
        }
        System.out.println(result);


        System.out.println("-------------");

        //way with for each loop
            for(String each:words){
            int count= Collections.frequency(words,each);
            if(count>1){
                if(result.contains(each)){
                    continue;
                }
                result.add(each);
            }

        }
        System.out.println(result);













    }
}
