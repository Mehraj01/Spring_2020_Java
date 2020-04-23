package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {

        // ternary:  ? means if,   : means else

        String result="";
        if(9>10){
            result="9is greater";
        }else{
            result="10 is greater";
        }

        String result2=(9>10)?"9is greater":"10 is greater";
        System.out.println(result2);

        System.out.println("================================================================");

        int age=20;
        boolean eligible=(age>=21)?true:false;
        /*
        if(age>=21){
            eligible=true;
        }else{
            eligible=false;
        }

         */

        System.out.println(eligible);

        System.out.println("=======================================================================");
        int age1=20;
        String ageVote="";

        if(age1>=18){
            ageVote="yes";
        }else{
            ageVote="no";
        }
        System.out.println(ageVote);

        String ageVote2=(age1>=18)? "yes":"noo";
        System.out.println(ageVote2);





    }
}
