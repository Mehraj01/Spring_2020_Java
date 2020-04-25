package SELF_PRACTICE.Replit_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Replit153_UniqueWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE



        for(int a=0; a<words.length; a++){
            int count=0;
            for(int i=0; i<words.length; i++ ){
                if(words[i].equals(words[a])){
                    count++;
                }
            }
            if(count==1){
                System.out.println(words[a]);
            }
        }





    }
}
