package SELF_PRACTICE.Replit_Practice;
import java.util.*;
public class Replit102_Arrays_ReverseSentence_Loop {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
         */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String []words=sentence.split(" ");
        String result="";

        for(int i=words.length-1; i>=0; i--){
            String reverse=words[i];
            result=reverse;
            System.out.println(result);
        }




    }
}
