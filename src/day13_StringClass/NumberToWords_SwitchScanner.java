package day13_StringClass;

import java.util.Scanner;

public class NumberToWords_SwitchScanner {
    public static void main(String[] args) {
        /*
        2. write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between 0 ~ 9");
        int num=input.nextByte();
        String result=" ";

        switch(num){
            case 1: result="Zero";
                break;
            case 2: result="One";
                break;
            case 3: result="Two";
                break;
            case 4: result="Three";
                break;
            case 5: result="Five";
                break;
            case 6: result="Six";
                break;
            case 7: result="Seven";
                break;
            case 8: result="Eight";
                break;
            case 9: result="Nine";
                break;
            default: result="Invalid";

        }
        System.out.println(result);

        String result2=(num==0)?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"Four":(num==5)?"Five"
                :(num==6)?"Six":(num==7)?"Seven":(num==8)?"Egiht":(num==9)?"Nine":"Invalid";
        System.out.println(result2);












    }
}
