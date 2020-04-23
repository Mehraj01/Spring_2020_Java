package SELF_PRACTICE.Replit_Practice;

import java.util.Arrays;

public class Replit167_Methods_RemoveDuplicates {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("BugBusters") ) ;
    }

    public static String uniqueChars(String str) {

        String unique = "";

        String word[]=str.split("");
        System.out.println(Arrays.toString(word));

        for(int i=0; i<word.length; i++){
            if(!unique.contains(word[i])){
                unique+=word[i];
            }
        }

        return unique;




    }
}