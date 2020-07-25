package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {

        //5, 9, 10 11

        //5
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Robb", "Bran", "Rick", "Bran"));
        //  0        1       2       3

        if( names.remove("Bran") ){    // {Robb", "Rick", "Bran"};
            names.remove("John");  //{Robb", "Rick", "Bran"};
        }

        System.out.println(names);
        System.out.println("=================================================");


        ArrayList<Character> list=new ArrayList<>();
        for(char i='a';i<='z';i++){// it will add all the lowercase chars with help of the loop to the ArrayList.
            list.add(i);
        }
        System.out.println(list);

        boolean result=list.containsAll(Arrays.asList('a','c', 'D')); // it returns false because for
                                                                     // loop only has lower case chars
        System.out.println(result);


    }
}
