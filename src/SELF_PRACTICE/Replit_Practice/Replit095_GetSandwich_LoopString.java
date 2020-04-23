package SELF_PRACTICE.Replit_Practice;
/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */

import java.util.Scanner;

public class Replit095_GetSandwich_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();



        for (int i=0; i<str.length(); i++){

        }

        int begin=str.indexOf("bread")+2;
        int end=str.indexOf("bread");



    }
}
