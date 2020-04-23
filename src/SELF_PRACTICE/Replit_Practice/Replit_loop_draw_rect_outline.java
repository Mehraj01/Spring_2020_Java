package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit_loop_draw_rect_outline {
    public static void main(String[] args) {
        /*
        you get a number, write a code that draws a rectangle outline the size of that number.
each rectangle row is 3 x: xxx
inner rectangle row is "x  x"

for example:

n = 2

xxx
x  x
x  x
xxx

         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        System.out.print("xxx");
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println("x x");
            }
        System.out.println("xxx");







    }
}
