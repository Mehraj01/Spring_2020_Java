package MyOwnLibrary.CODES;

import java.util.Scanner;

public class StringMethods_ForLoop {

}
class Middle_Character {
public static void main(String[] args) {

    /*
3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");

        String middleCharacter = "";
        for(int i=1; i<3;i++){
        String word = input.next();
        if(word.length()%2!=0){
        middleCharacter+=word.charAt(word.length()/2);
        }else{
        middleCharacter+=word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2);
        //System.out.println(word.charAt(word.length()/2-1));// word ==> o
        //System.out.println(word.charAt(word.length()/2));// word ==> r
        }

        }
        System.out.println(middleCharacter);


 }
}
//**********************************************************************************************************************
class RemoveFirstLetter_Scanner{
    public static void main(String[] args) {
        /*
        2. Ask user to enter two words. Print first word without its first character then print the
        second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

         */

        //TASK 16 delete first letters
        //Input: apple, banana
        //Output: ppleanana


        // my version with for loop
        Scanner scan=new Scanner(System.in);
        String result1="";
        for (int i=0; i<2; i++){
            System.out.println("Enter word ");
            String word=scan.next();
            result1+=word.substring(1);
        }
        System.out.println(result1);

    }
}

