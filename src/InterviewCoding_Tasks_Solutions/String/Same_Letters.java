package InterviewCoding_Tasks_Solutions.String;
import java.util.Arrays;

public class Same_Letters {
    public static void main(String[] args) {
         // anagrams ot not
        //Ex:  same("abc",  "cab"); -> true
             //same("abc",  "abb"); -> false

        boolean words=same("abc", "cba");
        System.out.println(words);


    }
//System.out.println("===============================================================================================");
//Write a return method that check if a string is build out of the same letters as another string.
    public static boolean same(String a, String b ){
/*
How To Find the Two String Contains Same Letter?

- first convert each String to char array for able to sort them
- then sort each array separately
- create 2 separate empty string to add new result to it
- create loops for each array and add every index inside the array to new string
- and use boolean find out they are the same or not? ==> str1.equals(str2);
 */

        char[]ch1=a.toCharArray();
        char[]ch2=b.toCharArray();
        //System.out.println(a);
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        String str1="";
        String str2="";

        for(char each: ch1){
            str1+=each;
        }


        for(int i=0; i<ch2.length; i++){
            str2+=ch2[i];
        }
/*
        for(char each: ch2){
            str2+=each;
        }

 */

        return str1.equals(str2);
    }
//System.out.println("===============================================================================================");

    public static boolean same2(String c, String d ){





        return true;
    }



}
