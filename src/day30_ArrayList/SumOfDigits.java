package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {
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

        String str="a1b2c3d4";

        char[]arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));
        int sum=0;// will contain all digits

        for(char each:arr){
            if(each>=48 && each<=57){ // if each is digit , we will convert to int and add it to sum
                //sum+=Integer.parseInt(""+each);
                String result=""+each;
                sum+=Integer.parseInt(result);

            }
        }
        System.out.println(sum);

/*        // another way
        if(Character.isDigit(each)){ // isDigit(): identifies if the given character is digit
            sum+=Integer.parseInt(""+each);
        }
 */

          Character.isAlphabetic('A');// identifies if the character is alphebet


        /*
          assignment task:
            extract the digits and letters form a string
         */



    }
}
