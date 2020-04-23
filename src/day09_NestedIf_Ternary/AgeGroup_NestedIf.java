package day09_NestedIf_Ternary;

public class AgeGroup_NestedIf {
    public static void main(String[] args) {

        /*
        write a program that can define the age groups of a person
             age groups are:
             teenager(<21)
             adult(>=21 && <55)
             Senior(>=55)
             age cannot be negative or greater than 170
         */

        int age=5;
        String result="";

        if(age>0 && age<120){

            if(age<21){
                result="Teenager";
            }else if(age<55){  // age is already greater or equal to 21
                result="Adult";
            }else{
                result="Senior";
            }

        }else{
          result="Invalid Entry";
        }
        System.out.println(result);

        System.out.println("==========================================================================");

        int age2 =45;
        String ageGroup2 ="";

        if(age2 < 150 && age2 > 0 ){

            ageGroup2 = (age2 < 21) ? "Teenager" :(age2<55)? "Adults" : "Senior";

        }else{
            ageGroup2 = "Invalid Entry";
        }

        System.out.println(ageGroup2); // Adult



    }
}
