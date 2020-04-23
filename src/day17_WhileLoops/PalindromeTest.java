package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {

        String str="Java";

        String reverseStr=""; // store the reversed version of str


        int index=str.length()-1;
        while(index>=0){
            reverseStr+=str.charAt(index);
            index--;
        }
        System.out.println(reverseStr);

        boolean palindrome=reverseStr.equals(str);





    }
}
