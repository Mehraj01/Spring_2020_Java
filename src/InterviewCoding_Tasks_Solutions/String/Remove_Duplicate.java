package InterviewCoding_Tasks_Solutions.String;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_Duplicate {
    public static void main(String[] args) {

        //Ex:  removeDup("AAABBBCCC")  ==> ABC

        String a = removeDuplicate("AAABBBCCC");
        System.out.println(a);
        String b = removeDuplicate2("AAABBBCCC");
        System.out.println(b);


    }
//System.out.println("===============================================================================================");

    public static String removeDuplicate(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }
//System.out.println("===============================================================================================");

    public static String removeDuplicate2(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(",", "").replace("[", "").replace("]", "");
        System.out.println(str);
        return str;

    }
}