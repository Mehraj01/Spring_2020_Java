package WarmupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Remove_words_byLength {
    public static void main(String[] args) {
        /*
        3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greate
         */

        ArrayList<String> countryNames = new ArrayList<>();
       countryNames.addAll(Arrays.asList("Usa","Azerbaijan","Turkey","Kazakhstan", "Italy", "Norway","Turkmenistan", "Cypress"));

        Predicate<String> remove = a -> a.length()>=10;
        countryNames.removeIf(remove);
        System.out.println(countryNames);








    }

}
