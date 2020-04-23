package day10_Switch_Scanner;

public class days {
    /*
    2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

     */
    public static void main(String[] args) {

        int num=3;
        String result="";

        if(num>0 && num <8){
            if(num==1){
                result="Monday";
            }else if(num==2){
                result="Tuesday";
            }else if(num==3){
                result="Wednesday";
            }else if(num==4){
                result="Thursday";
            }else if(num==5){
                result="Friday";
            }else if(num==6){
                result="Saturday";
            }else if(num==7){
                result="Sunday";
            }

        }else{
            result="Invalid";
        }
        System.out.println(result);

        System.out.println("================================================================================");

        String result2="";

        //  Second and shorter way with Ternary


            result2=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday"
                    :(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":(num==7)?"Sunday": "Invalid";

        System.out.println(result2);


        System.out.println("===================================================================================");

        String result3="";

        if(num>0 && num <8){


            result3=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday"
                    :(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":"Sunday";

        }else{
            result3="Invalid";
        }
        System.out.println(result3);




    }
}
