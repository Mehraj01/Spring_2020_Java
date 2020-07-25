package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_Uniques {
    public static void main(String[] args) {

        Character []chars={'A','A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList =  new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result =  new ArrayList<>();// we will store unique object inside it



        for(int i=0; i<charList.size(); i++){
            int count= Collections.frequency(charList,charList.get(i));
            if(count==1){
                result.add(charList.get(i));
            }

        }
        System.out.println(result);

        System.out.println("========================");

        // to do with for each loop

        for(int each:charList){
            int count= Collections.frequency(charList,each);
            if(count==1){
                //result.add(charList.get(each));
                result.add((char) each);
            }

        }
        System.out.println(result);




    }
}
