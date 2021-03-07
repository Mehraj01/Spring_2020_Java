package InterviewCoding_Tasks_Solutions.Numbers;

public class Factorial_Number {

    public static void main(String[] args) {


        int a=factorialNumber(5);
        System.out.println(a);
    }




    public static int factorialNumber(int n){

        //Write a return method that returns the factorial number of any given number
        //Ex:
        //Input: 5
        //outPut: 120


       // Factorial Number; 5! = 5*4*3*2*1=120


        int result = 1; // it has to start with 1 because every time resu;t will be multiply with i
        for(int i = 1; i <= n; i++){
            result = result * i; // 1*1 , 1*2, 2*3, 6*4, 24*5
        }
        return result;

    }
}
