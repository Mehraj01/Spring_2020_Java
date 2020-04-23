package day09_NestedIf_Ternary;
/*
write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */

public class ageGroups {
    public static void main(String[] args) {

        int age=78;
        String ageGroups="";

        if(age<3 && age>0){
            ageGroups="Baby";
        }else if(age>=3 && age<=5){
            ageGroups="Toddler";
        }else if(age>=6 && age<=9){
            ageGroups="Kid";
        }else if(age>=10 && age<=12){
            ageGroups="Pre-teen";
        }else if(age>=13 && age<=17){
            ageGroups="Teenagers";
        }else if(age>=18 && age<=20){
            ageGroups="Young Adult";
        }else if(age>=21 && age<=39){
            ageGroups="Adult";
        }else if(age>=40 && age<=49){
            ageGroups="Young Middle-Aged Adult";
        }else if(age>=50 && age<=54){
            ageGroups="Middle-Aged Adult";
        }else if(age>=55 && age<=64){
            ageGroups="Very Young Senior Citizens";
        }else if(age>=56 && age<=74){
            ageGroups="Young Senior Citizens";
        }else if(age>=75 && age <= 84){
            ageGroups="Senior Citizens";
        }else if( age>=85 && age<=150){
            ageGroups="Old Senior Citizen";
        }else{
            ageGroups="Invalid Entry";
        }

        System.out.println(ageGroups);


        boolean eligibleToBuy=ageGroups=="Adult" || ageGroups=="Young Middle-Aged Adult" ||
                               ageGroups=="Middle-Aged Adult";

        if(eligibleToBuy){
            System.out.println("Your are eligible");
        }else{
            System.out.println("You are not eligible");
        }





    }
}
