package WarmupTasks;
/*
1. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

 */

import java.util.ArrayList;

public class SumOf_String_Integers {
    public static void main(String[] args) {
/*
1. write a program that can return the sum of all the digits from a string
         ex:
            input: "a1b2c3"
            output: 6
               (1+2+3= 6)
            input: "Today's date is 04/27/2020"
            output: 17
               (0+4+2+7+2+0+2+0=17)
         HINT: on ascii table, the characters between #48 ~ #57 are digits
 */

        String str="12abc20yz68";
        int sum=0;// it will hold sum of all numbers present in the string

        for(int i=0; i<str.length(); i++){
            //Character.isDigit(str.charAt(i) => this method will check if the each String indexes (chars) are numbers or not
            if(Character.isDigit(str.charAt(i))){
                //if it is numbers it assign char numbers to string result
                String result=""+str.charAt(i);

                // After that we will convert string numbers to the integer.
                int num=Integer.parseInt(result);
                //sum will hold the sum of the total integers
                sum+=num;
               // System.out.print(result); //This is just for test: result holds the numbers of the str.
                //For exp: String str="12abc20yz68"; ==> 122068
            }
        }

        System.out.println(sum);


    }

}
