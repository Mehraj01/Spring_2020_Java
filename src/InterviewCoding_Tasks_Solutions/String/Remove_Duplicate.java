package InterviewCoding_Tasks_Solutions.String;

public class Remove_Duplicate {
    public static void main(String[] args) {

        //Ex:  removeDup("AAABBBCCC")  ==> ABC

        String a=removeDuplicate("AAABBBCCC");
        System.out.println(a);



    }
//System.out.println("===============================================================================================");

    public static String removeDuplicate(String str){

        String result="";

        for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result+=""+str.charAt(i);
            }
        }

        return result;
    }
//System.out.println("===============================================================================================");




}
