package InterviewCoding_Tasks_Solutions.String;

import java.util.Arrays;
import java.util.Collections;

public class Finding_Uniques {
    public static void main(String[] args) {

        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        String b=uniques("AAABBBCCCDEF");
        System.out.println(b);

        String c=Uniques("AAABBBCCCDEF");
        System.out.println(c);

        String d=Uniques3("AAABBCCDEF");
        System.out.println(d);



    }
    //System.out.println("===============================================================================================");

    public static String uniques(String str){

/*
How To Find Uniques In The String?

- first convert string to String Array
- Create new empty String to add the final result in it
- create count to count the occurrence of the characters in the string
- create for loop length of array
- and compare the array indexes with each other ==> arr[i].eqauls(arr[0]);
- and count them
- outside of the loop create another if to check if array index == to 1
- and add the array indexes that empty string you created
*/

        String arr[]=str.split("");
        String uniques="";

        for(int k=0; k<arr.length; k++ ){

            int count=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i].equals(arr[k])){
                    count++;
                }
            }
            if(count==1){
                uniques+=arr[k];
            }
        }

        return uniques;
    }
//System.out.println("===============================================================================================");


    public static String Uniques(String str){

        String result="";

        for(String each: str.split("")){
            if(Collections.frequency(Arrays.asList(str.split("")), each)==1 ){
                result+=each;
            }
        }

        return result;
    }
//System.out.println("===============================================================================================");

    public static String Uniques3(String str){

        String unq="";
        for(int k=0; k<str.length(); k++ ){
            int count=0;
            for(int i=0; i<str.length(); i++ ){
                if(str.charAt(i)==(str.charAt(k)))
                    count++;
            }
            if(count==1){
                unq+=str.charAt(k);
            }
        }
        return unq;


    }





}
