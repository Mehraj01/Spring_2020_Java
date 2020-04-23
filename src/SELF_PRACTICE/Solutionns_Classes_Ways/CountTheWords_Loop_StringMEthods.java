package SELF_PRACTICE.Solutionns_Classes_Ways;

import java.util.Scanner;

public class CountTheWords_Loop_StringMEthods {
    public static void main(String[] args) {
             /*
        Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1

         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;
        while (str.contains("hi")) {
            count++;
            str = str.substring(str.indexOf("hi") + 1);
        }
        System.out.println(count);


        System.out.println("==========================================================");

        /*
        int count=0;

        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
                count++;
            }

        }

        System.out.println(count);


        System.out.println("================================================================");


        int count=0;

        for(int i=0; i<=str.length()-1; i++){
            if(str.contains("hi")){
                str=str.substring(str.indexOf("hi")+1);
                count++;
            }
        }

        System.out.println(count);

         */



    }
}
