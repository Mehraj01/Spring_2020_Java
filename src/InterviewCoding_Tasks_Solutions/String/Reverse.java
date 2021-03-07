package InterviewCoding_Tasks_Solutions.String;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

       // Ex: Reverse("ABCD"); ==> DCBA

        String a=strReverse("ABCD hello");
        System.out.println(a);
        char []word={'a', 'b', 'd'};
        ReverseChar(word);



    }
    public static String strReverse(String str){

        String reverse="";

        for(int i=str.length()-1; i>=0; i--){ // It has to be str.length()-1; and i>=0;
            reverse+=str.charAt(i);           // Getting error message with this: str.length(); and i>0;
            //reverse+=str.toCharArray()[i];
        }


        return reverse;
    }

    public static String strReverse2(String str){

        String result=new StringBuilder(str).reverse().toString();
        System.out.println(result);

        return result;
    }

    public static void ReverseChar(char[]letters){
        for (int i =letters.length-1; i>=0; i--) {
            System.out.println(letters[i]);
        }
    }


}
