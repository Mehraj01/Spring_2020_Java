package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate<Integer>oddNumber=x -> x % 2 !=0;
        ArrayList<Integer> list=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));
        list.removeIf(oddNumber);// removeIf() -> only accept predicate
        System.out.println(list);

        System.out.println("============================================");

        ArrayList<Integer> list2=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));
        Predicate<Integer>num1=p -> p<5;
        list2.removeIf(num1);
        System.out.println(list2);

        System.out.println("===============================================");

        ArrayList<String> planets=new ArrayList<>( Arrays.asList("Mars", "Pluto", "Earth", "Moon", "Venus", "Saturn","Sun"));

        Predicate<String>starts=s -> !s.toUpperCase().startsWith("S");
        planets.removeIf(starts); // it will remove word that with start with S.
                                  // if give ! it will remove all the words start with different letter that S
        System.out.println(planets);


        //if planet starts wit "P" or "M" remove the planet
        ArrayList<String> words=new ArrayList<>( Arrays.asList("Mars", "Pluto", "Earth", "Moon", "Venus", "Saturn","Sun"));

        Predicate<String> PM = a -> a.startsWith("P")||a.startsWith("M");
        words.removeIf(PM);
        System.out.println(words);

        System.out.println("=====================================================");

        ArrayList<Character> chars=new ArrayList<>( Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
        Predicate<Character>digits=c ->c>=48&&c<=57;
       // Predicate<Character>digits=c ->Character.isDigit(c);     // this is a another way to eleminate the digits
        chars.removeIf(digits);
        System.out.println(chars);

        System.out.println("=====================================================");

        ArrayList<Integer> nums=new ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));
        nums.removeIf(p ->p>5);
        System.out.println(nums);

        System.out.println("=====================================================");
        ArrayList<Character> specialCh=new ArrayList<>( Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
        Predicate<Character>remove=g ->(g>=58 && g<=64 ) && (g>=32&& g<=47 );
        specialCh.removeIf(remove);
        System.out.println(specialCh);








    }
}
