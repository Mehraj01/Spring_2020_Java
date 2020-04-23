package day10_Switch_Scanner;

public class SwitchStatment_Practice3 {
    public static void main(String[] args) {

        char ch='A';
        String result="";

        switch(ch){
            case'A':
                //System.out.println("A");
                //result="A";
                result+="A";
                //break;
            case'B':
                //System.out.println("B");
                //result="B";
                result+="B";
                break;
            case'C':
               // System.out.println("c");
                //result="C";
                result+="C";
                break;
            case 'D':
               // System.out.println("D");
                result="D";
                break;
            default:
               // System.out.println("Invalid");
                result="Invalid";

        }

        System.out.println(result);


    }
}
