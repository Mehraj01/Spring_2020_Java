package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {
        /*

        int number=0;

         if(number>=0){
             System.out.println(number+ " The number is positive");
         } else{
             System.out.println(number+ " is negative");
         }

         int number1=100;

         if(number1 % 2==0){
             System.out.println(number1+ "is even number");
         }

        if(number1 % 2 !=0){
            System.out.println(number1+ "is oddnumber");
        }

         */
        int num=100;
        boolean eveNum=num%2==0;
        if(eveNum){
            System.out.println(num+" is greater number ");
        }else{//otherwise
            System.out.println(num+" id odd number");
        }

        int age=30;
        if(age>=21){
            System.out.println("Here is your Vodka");
        }else{
            System.out.println("Go home kids...");
        }


        boolean tPC=true;
        if(tPC){
            System.out.println("Buy more toilet paper and stay at home");
        }else{
            System.out.println("Do more coding");
        }











    }
}
