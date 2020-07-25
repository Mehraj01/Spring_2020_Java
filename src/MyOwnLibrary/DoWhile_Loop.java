package MyOwnLibrary;
 // >>>>>   do...while loop  <<<<<
//A do...while loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.
//Boolean expression appears at the end of the loop, so the statements in the loop execute once before the Boolean is tested.
//If the Boolean expression is true, the control jumps back up to do statement, and the statements in the loop execute again.
//This process repeats until the Boolean expression is false.

public class DoWhile_Loop {
    public static void main(String[] args) {
        /*

        TASK 1. Reverse String

("===================================================================================================================");

       TASK 2. Even nums, break and continue statements

       print all the even number in the same line separated by space


("===================================================================================================================");

          TASK 3. Break and continue statements

("===================================================================================================================");

          Task 4. write a program that can divide two numbers

			NOTE: DO NOT USE division, multiplication, or module operator
			  10 / 3  ==> 3 with a remainder of 1
              10 - 3 - 3 - 3 = 1
              a = a - b = 7;
              a = a - b = 4;
              a = a - b = 1;
              COUNT =  3;   a = 1;


         */


    }
}

class Reverse{
    public static void main(String[] args) {

       // TASK 1. Reverse String

        String str = "I like java";
        String rev = "";

        int lastIndex = str.length()-1;
        do{
            rev +=  str.charAt(lastIndex);// add str.str.charAt(lastIndex) to rev
            lastIndex--; //decrement starts from last index
        }while(lastIndex >= 0);// decrement till last index which is zero int this example

        System.out.println(rev);

//System.out.println("===============================================================================================");
    }
}

class EvensNums_1_100{
    public static void main(String[] args) {

       // TASK 2. Even Numbers 1~100

    //A do...while loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.
   //Boolean expression appears at the end of the loop, so the statements in the loop execute once before the Boolean is tested.
   //If the Boolean expression is true, the control jumps back up to do statement, and the statements in the loop execute again.
  //This process repeats until the Boolean expression is false.

        int num = 0;
        do{// do this ==> following condition
            if(num % 2 == 0 ) {
                System.out.print(num + " ");
            }
            num++;//increment bye 1
        } while(num <= 100);// increase the number while num <= 100 ==> ( num is greater or equal to 100)

        System.out.println();// we need this print line because we used System.out.print


        System.out.println("****************************");

        int t = 1; //1
        do{
            if(t%2 != 0){ // if it not even number (odd number) ==> skip the condition. Means it will skip odd numbers
                t++;  // to make sure that the iterator (increment) is not skipping...
                // increment odd number and skip will skip it...
                continue;// after iteration skip it
            }
            System.out.print(t+" ");
            t++;
        }while(t <= 100);

//System.out.println("===============================================================================================");
    }
}

class Break_Continue_St{
    public static void main(String[] args) {

       // TASK 3. Break and continue statements

        int z =1;
        do{
            System.out.println(z);
            if(z == 2){
                break;// skip the loop after iteration 2
            }
            z++;
        }while(z <= 5);


        System.out.println("****************************");


        int y = 1; //3
        do{
            if(y == 3){// it will skip number 3 and move to 4 directly
                y++;   // need to make sure that the iterator is not skipping, so that the condition will eventually be false
                // it will be incremented by 3 after will skip the 3
                continue;
            }
            System.out.println(y); // 1, 2
            y++;
        }while(y <= 5);
        //     3 <= 5

//System.out.println("===============================================================================================");
    }
}


class NumberDivide_By2Numbers{
    public static void main(String[] args) {

        //Task 4. write a program that can divide two numbers

        int a = 20;
        int b = 3;

        if(b == 0){
            System.out.println("b cannot be zero");
            System.exit(0);
        }


        int count = 0; // count the execution of the loop
        while( a  >= b){
            a -= b; // 20-3=17-3=14-3=11-3=8-3=5-3=2
            count++;
        }
        if(a == 0) {
            System.out.println("The result is " + count);
        }else{
            System.out.println("The result is " + count+" with a remainder of "+a);
        }
//System.out.println("===============================================================================================");
    }
}



