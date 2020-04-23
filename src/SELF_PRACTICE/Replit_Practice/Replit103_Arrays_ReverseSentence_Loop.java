package SELF_PRACTICE.Replit_Practice;
import java.util.*;
public class Replit103_Arrays_ReverseSentence_Loop {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
         */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[]word=sentence.split(" ");


        String reversed = "";

        for(int i=word.length-1; i>=0; i--){
            String eachWord=word[i];
            reversed+=eachWord+" ";
        }
        System.out.println(reversed.trim());



    }

}
