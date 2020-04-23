package day16_ForLoop;

public class RmeoveDuplicate {
    public static void main(String[] args) {
         /*
         task:
          write a program that can remove duplicated characters from a string
         */


        String str = "ABAB";
        // index number:123


        String result = "";  // "CD" We store expected result

        for(int i=0; i <= str.length()-1 ; i++){  // 0 , 1, 2 ,3
            /*
            if( !result.contains( ""+str.charAt(i)) ) {
                result += str.charAt(i);
            }
             */

            if(result.contains( ""+str.charAt(i) )){// is in the index number
                continue;// if the string result does not contains str.charAt(i), then we concate it to the result,
                         // if it does we will not concate it to the result
            }

            result += str.charAt(i);

        }

        System.out.println(result);








    }
}
