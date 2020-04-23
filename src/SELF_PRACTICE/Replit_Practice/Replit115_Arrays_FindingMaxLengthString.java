package SELF_PRACTICE.Replit_Practice;
import java.util.*;
public class Replit115_Arrays_FindingMaxLengthString {
    public static void main(String[] args) {
        /*
     Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa

         */
        Scanner input=new Scanner(System.in);

        String[] words = new String[5];

        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }


        int max=words[0].length();
        String largest=words[0];

        for(int i=0; i<words.length; i++){

            if(words[i].length()>max){
                max=words[i].length();
                largest=words[i];
            }

        }
        System.out.println(largest);




    }
}
