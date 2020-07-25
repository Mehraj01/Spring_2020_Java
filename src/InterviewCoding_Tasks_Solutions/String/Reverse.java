package InterviewCoding_Tasks_Solutions.String;

public class Reverse {
    public static void main(String[] args) {

       // Ex: Reverse("ABCD"); ==> DCBA

        String a=strReverse("ABCD");
        System.out.println(a);


    }
    public static String strReverse(String str){

        String reverse="";

        for(int i=str.length()-1; i>=0; i--){ // It has to be str.length()-1; and i>=0;
            reverse+=str.charAt(i);           // Getting error message with this: str.length(); and i>0;
            //reverse+=str.toCharArray()[i];
        }


        return reverse;
    }


}
