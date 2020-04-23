package SELF_PRACTICE.Replit_Practice;
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string
is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
import java.util.Scanner;

public class Replit097_Java_Python {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava=0;
        int countPython=0;
        String[] words = sentence.split(" ");

        for(int i=0; i<words.length; i++){
            if(words[i].contains("java")){
                countJava++;
            }
            if(words[i].contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava==countPython);



    }
}
