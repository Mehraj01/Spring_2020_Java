package SELF_PRACTICE.Replit_Practice;
/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an if that checks
if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
 */


public class Replit145_NestedLOOP_Arterisk {


    public static void printHollowRect(){
        // write your code here:
        System.out.println("*****");
        for(int j=1; j<=3; j++){//colums
            for(int i=1; i<=2; i++){// rows
                System.out.print("*   ");
            }
            System.out.println();
        }
        System.out.println("*****");


    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }



}
