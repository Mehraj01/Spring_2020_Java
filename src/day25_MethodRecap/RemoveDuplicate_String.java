package day25_MethodRecap;

public class RemoveDuplicate_String {
    public static void main(String[] args) {


        String str = "ABABABABAB";

        String result =  "";      //AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }

        }

        System.out.println(result);


        String str2 = "ABCABCABC";

        String result2 = RemoveDuplicates(str2);  //ABC

        System.out.println(result2);


    }

    public static String RemoveDuplicates(String str){
        String result =  "";      //AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }

        }

        return result;
    }

}
