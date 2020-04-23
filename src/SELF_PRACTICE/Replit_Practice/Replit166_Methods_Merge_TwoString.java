package SELF_PRACTICE.Replit_Practice;

public class Replit166_Methods_Merge_TwoString {
    public static void main(String[] args) {
        String mix=mergeStrings("Hello", "123459");
        System.out.println(mix);
    }

    public static String mergeStrings(String one, String two) {
        String merge="";

        int i=0;
        int j=0;
        while(i<one.length()&&j<two.length()){
            merge+=one.charAt(i++);
            merge+=two.charAt(j++);
        }while(i<one.length()){
            merge+=one.charAt(i++);
        }while(j<two.length()){
            merge+=two.charAt(j++);
        }
        return merge;

        /*
            String result = "";
    int length = 0;
       length= (one.length() > two.length())? one.length():two.length();
        for (int i = 0; i < length; i++) {
            if (i < one.length()) {
                result += one.charAt(i);
            }
            if (i < two.length()) {
                result += two.charAt(i);
            }
        }return result;
         */

    }

}
