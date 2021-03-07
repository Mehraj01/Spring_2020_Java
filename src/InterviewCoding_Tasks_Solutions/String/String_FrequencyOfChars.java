package InterviewCoding_Tasks_Solutions.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String_FrequencyOfChars {
    public static void main(String[] args) {
     //("AAABBCDD") ==> A3B2C1D2

        String a=FrequencyOfChars("AAABBCDD");
        System.out.println(a);


        String b=FrequencyOfChars_2("AAABBCDD");
        System.out.println(b);


        String c=FrequencyOfChars_3("AAABBCDD");
        System.out.println(c);


    }
//System.out.println("===============================================================================================");
    public static String FrequencyOfChars(String str){        System.out.println("******** FrequencyOfChars *********");
/*

How to Find Frequency of The String Chars?
- create empty string to add Non Duplicate char
- create for loop
- create if condition to check if Non Duplicate each indexes contains each string indexes
- use empty string to add result on it

- create another empty string to add final result

- create count variable;
- create for loop with length of your original string
- if original string each indexes  == Non Duplicate each indexes
- then count them

- create another loop to length of Non Duplicate repeat your second loop. cut and past second for loop inside this loo
- add this loop index inside the non Duplicate index
- use empty string to add final result in it by doing non Duplicate each index + count

 */


        String nonDup="";
        for(int i=0; i<str.length();i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i); // nonDup ==> ABCD
            }
        }
        //System.out.println(nonDup);

        String result="";

        // loop i iterate str and loop k iterate NonDup
        for(int k=0; k<nonDup.length(); k++ ){ //ABCD.==>  This loop runs size of nonDup.length().
            int count=0;
            //System.out.println(k); // index k = 0 1 2 3
            for(int i=0; i<str.length();i++){ // AAABBCDD ==> This loop runs size of str.length()
               // System.out.println(i); // index i = 0 1 2 3 4 5 6 7
                if(str.charAt(i)==nonDup.charAt(k)){// it will compare AAABBCDD ==> ABCD
                    count++;                   //index 0 = index 0,1,2,3,4,5,6,7
                }                              //index 1 = index 0,1,2,3,4,5,6,7
            }                                  //index 2 = index 0,1,2,3,4,5,6,7
                                               //index 2 = index 0,1,2,3,4,5,6,7

            result+=nonDup.charAt(k)+""+count;  //A3B2C1D2
        }


     return result;


    }

//System.out.println("===============================================================================================");
    public static String FrequencyOfChars_2(String str2){     System.out.println("******** FrequencyOfChars_2 *********");

        String result2="";

        int k=0;
        while(k<str2.length()){
            int count2=0;
            for(int i=0; i<str2.length(); i++){ //str1.charAt(i)
                if(str2.charAt(i)== str2.charAt(k)){// A==A ==> count, A==A ==> count, A==A ==> count
                    count2++;               //B==B ==> count,B==B ==> count, C==C ==> count, D==D ==> count, D==D ==> count
                }
            }
            result2+=str2.charAt(k)+""+count2;//str1.charAt(j)   ABCD + count 3, 2, 1, 2
          //  System.out.println(result2);
            //A3
            // A3B2
            // A3B2C1
            // A3B2C1D2
            str2= str2.replace(""+str2.charAt(k), "");// This will replace above codes with empty String

        }
        return result2; //A3B2C1D2
    }
//System.out.println("===============================================================================================");

    public static String FrequencyOfChars_3(String str3){   System.out.println("******** FrequencyOfChars_3 *********");

        String NonDup="", result="";

        for(int i=0; i<str3.length(); i++){
            if(!NonDup.contains(""+str3.charAt(i))){
                NonDup+=""+str3.charAt(i); //ABCD
            }
        }

        for(int i=0; i<NonDup.length(); i++){
                                                 // frequency of  each index of str3
            int num= Collections.frequency(Arrays.asList(str3.split("")),""+NonDup.charAt(i));
            // will count the occurrence of chars..  We have to split it to get the single chars to able to count it
            System.out.println(num); // 3 2 1 2
            result+=""+NonDup.charAt(i)+num+" "; //NonDup.charAt(i) ==> ABCD  + num ==> 3,2 1,2   //A3 B2 C1 D2
        }

        return result;
    }
//System.out.println("===============================================================================================");



}


