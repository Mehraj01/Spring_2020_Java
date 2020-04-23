package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */
public class Replit086_CatAndDogs_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        word=word.toLowerCase();


        for(int i=0; i<word.length(); i++){
            if(word.contains("cat")){
                word=word.replaceFirst("cat", "");
                countOfCats++;
            }
            if(word.contains("dog")){
                word = word.replaceFirst("dog", "");
                countOfDogs++;
            }
        }
        System.out.println(countOfCats);
        System.out.println(countOfDogs);

        System.out.println(countOfCats == countOfDogs);





    }
}
