package SELF_PRACTICE.Replit_Practice;

import java.util.Arrays;

public class Replit113_Nested_ForEachLoop {
    public static void main(String[] args) {
             /*
      Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
         */


        for(int i=80; i>=20; i--){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
















    }
}
