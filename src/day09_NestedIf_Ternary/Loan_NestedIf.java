package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {

        double salary=20000;
        byte workHistory=1;

        if(salary>=30000){ // might be qualified

            if(workHistory>=2){
                System.out.println("Your are qualified for loan");
            }else{
                System.out.println("you have to have at least 2 years experience");
            }



        }else{
            System.out.println("your have to earn $30000");
        }



    }
}
