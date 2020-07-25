package WarmupTasks;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

import java.util.function.Predicate;

public class Extract_specialCharacters {
    public static void main(String[] args) {

        /*
        4. write a program that can extract the sepecial characters, digits and alphebets from a string
        and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
         */

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character>list=new ArrayList<>();
        for(char each: str.toCharArray()){
            list.add(each);
        }
        //System.out.println(list);

        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character>characters=new ArrayList<>();
        ArrayList<Character>specialCh=new ArrayList<>();


        for(int i=0; i<list.size();i++) {
            if(Character.isDigit(list.get(i))){
                digits.add(list.get(i));
            }

            if(Character.isAlphabetic(list.get(i))){
                characters.add(list.get(i));
            }

            if(!Character.isDigit(list.get(i))&&!Character.isAlphabetic(list.get(i))){
                specialCh.add(list.get(i));
            }
        }

        System.out.println(digits);
        System.out.println(characters);
        System.out.println(specialCh);

    }
}
