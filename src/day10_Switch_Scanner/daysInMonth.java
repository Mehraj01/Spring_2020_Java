package day10_Switch_Scanner;

public class daysInMonth {
    /*
    4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12

	 		precondition: num ( 1~12)
     */
    public static void main(String[] args) {

        int num=12;

        boolean days28=num==2;
        boolean days30=num==4||num==6||num==9||num==11;

        String result="";
        if(num>0 && num<13){
            result=(days28)?"Has 28 days":(days30)?"Has 30 days":"Has 31 days";
        }else{
            result="Invalid";
        }
        System.out.println(result);

        System.out.println("==========================================================================");

        /*
        2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
         */

        int days=7;
        boolean totals=days>0 && days<8;
        String result1="";



        if(totals){
            if(days==1){
                result="Monday";
            }else if(days==2){
                result="Tuesday";
            }else if(days==3){
                result="Wednesday";
            }else if(days==4){
                result="Thursday";
            }else if(days==5){
                result="Friday";
            }else if(days==6){
                result="Saturday";
            }else{
                result="Sunday";
            }

        }else{
            result="Invalid";
        }
        System.out.println(result);



    }
}
