package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit079_String_NoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        /*
        In this exercise you get a string called txt .
         output txt without its last letter.
        for example:
        txt = "foo"
        output will be:
         fo
         */

       String result=txt.substring(0,txt.length()-1);
        System.out.println(result);






    }
}
