package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice {
    public static void main(String[] args) {

        byte weekdays=9;
        boolean validNumber=weekdays>0 && weekdays<8;
        String result="";

        if(validNumber){
            if(weekdays==1){
                result="Monday";
            }else if(weekdays==2){
                result="tuesday";
            }else if(weekdays==3){
                result="Wedn";
            }else if(weekdays==4){
                result="thursday";
            }else if(weekdays==5){
                result="Friday";
            }else if(weekdays==6){
                result="Saturday";
            }else{
                result="sunday";
            }
        }else{
            //System.out.println("Invalid Entry");
            result="Invalid";
        }

        System.out.println(result);



    }
}
