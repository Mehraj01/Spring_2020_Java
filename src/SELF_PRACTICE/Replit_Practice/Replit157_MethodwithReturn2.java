package SELF_PRACTICE.Replit_Practice;
/*
max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
 */
public class Replit157_MethodwithReturn2 {
    public static void main(String[] args) {

        int number=max(5,6);
        System.out.println(number);
    }



    public static int max(int x,int  y){
         if(x>y){
             return y;
         }else {
             return x;

         }
    }

}
