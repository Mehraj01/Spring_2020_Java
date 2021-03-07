package InterviewCoding_Tasks_Solutions.Numbers;

public class FibonacciNumbers {

    public static void main(String[] args) {


        System.out.println(fib(9));
        System.out.println(fib(10));
    }



    //Write a return method that returns the  Fibonacci of any given number
    public static int fib(int num){

        int a=10;
        int b=2;
        //if(a>b){
        int count=0;
        for(int i=a; i>=b; i-=b){
            count++;

        }

//In fibonacci series, next number is the sum of previous two numbers
// for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

        int j=0;
        int z=1;

        int result=0;
        for(int i=1; i<num; i++){// size: 1,2 3,4
            result=j+z;// 0+1, 1+1,
            j=z; // j=1, j=1,
            z=result;// z=1, z=2,
        }
        return result;

    }


//DecimalFormat DF = new DecimalFormat();
//double a = 10.0/3.0;
//System.out.println(a);
//System.out.println(DF.format(a));


}
