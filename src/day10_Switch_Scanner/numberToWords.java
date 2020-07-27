package day10_Switch_Scanner;

public class numberToWords {
    /*
    	3. write a java program that can convert numbers between 0 ~ 9 to words,
    	if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS

     */
    public static void main(String[] args) {
        //0~9
        int num=-9;

        String word=(num==0)?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"four":(num==5)?"Five"
                :(num==6)?"Six":(num==7)?"Seven":(num==8)?"Egiht":(num==9)?"Nine":"Invalid";

        System.out.println(word);


        // with my way
        String word1="";
        if(num<9 &&num>0){
           word1=(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"four":(num==5)?"Five"
                    :(num==6)?"Six":(num==7)?"Seven":(num==8)?"Egiht":"Nine";
        }else{
            word1="Invalid number";
        }
        System.out.println(word1);





    }
}
