package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit064_middleOne_StringMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()%2!=0 && word.length()>=3) {
            String middle1 = word.substring (word.length()/2, word.length()/2+1);
            System.out.println(middle1);
        }else if(word.length()-1==0){
            System.out.println(word+word+word);
        }else if(word.length()%2==0 && word.length()>=4){
            String middle2 = word.substring (word.length()/2-1, word.length()/2+1);
            System.out.println(middle2);
        }else if(word.length()==2){
            System.out.println(word+word);
        }





    }
}
