package OfficeHours.Practice_03_25_2020;

public class IfElse_Practice {

    public static void main(String[] args) {

        int num=200;

        if(100%2 !=0){//odd condition
            System.out.println(num+"is odd number");

        //}if(num%2=0){// even condition
            //System.out.println(num+" is even number");
       // } (instead of to single if statement use if else statement

        } else{
            System.out.println(num+" is even number");
        }



        int age =21;

        if(age>=21){
            System.out.println("your are eligible");
        }else{
            System.out.println("Your are not eligible");
        }


        boolean genderMale=true;

        if(genderMale){
            System.out.println("Gender is male");
        }else{
            System.out.println("Gender is female");
        }



        boolean usCitizen=true;
        int ageOfPerson=30;

        if(usCitizen==true && ageOfPerson>=18 ){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }




    }
}
