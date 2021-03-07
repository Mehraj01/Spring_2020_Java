package PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListAnagram {

    public static void main(String[] args) {

        // Driver program
        String arr[] = { "code", "doce", "ecod", "framer","frame" };
        printAnagrams(arr);
    }




    private static void printAnagrams(String arr[]) {
        HashMap<String, List<String> > map = new HashMap<>();

        List<String>list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i]; // every index inside the array
            char[] letters = word.toCharArray(); // every chars inside the index
            Arrays.sort(letters);
            String newWord = new String(letters);// new sorted word that we saved it into string

            if(!list.contains(newWord)){
                list.add(newWord);
            }

        }
        System.out.println(list);

    }


}
