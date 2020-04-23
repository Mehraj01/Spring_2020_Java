package day16_ForLoop;

import java.util.Scanner;

public class PalinDromeTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your words");
        String word=input.nextLine();

        String reversedWord="";

        for(int i=word.length()-1;i>=0; i--){
            reversedWord+=word.charAt(i);//because we are getting characters from word to be able
                                         // to build reversed word
        }

        System.out.println(reversedWord);

        boolean palindrome=word.equals(reversedWord);
        System.out.println(palindrome);





    }
}
