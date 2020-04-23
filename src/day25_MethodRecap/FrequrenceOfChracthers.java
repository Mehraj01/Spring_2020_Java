package day25_MethodRecap;

import Resources.Library;

public class FrequrenceOfChracthers {
    public static void main(String[] args) {

        String str="AABBC";

        String result="";
        String nonDup= Library.RemoveDuplicates(str); //ABC
       // System.out.println(nonDup);

        for(int i=0; i<nonDup.length(); i++) {   //A2B2C1
            String ch = "" + nonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result+=ch + num;
           // System.out.print(ch + num);
        }
        System.out.println(result);
    }

    public static String FrequencyOfChars(String str){

        String result="";
        String nonDup= Library.RemoveDuplicates(str); //ABC
        // System.out.println(nonDup);

        for(int i=0; i<nonDup.length(); i++) {   //A2B2C1
            String ch = "" + nonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result+=ch + num;
            // System.out.print(ch + num);
        }
        //System.out.println(result);
        return result;
    }

}
