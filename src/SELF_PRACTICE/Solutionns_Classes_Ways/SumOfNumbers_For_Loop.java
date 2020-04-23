package SELF_PRACTICE.Solutionns_Classes_Ways;

public class SumOfNumbers_For_Loop {

    public static void main(String[] args) {
         /*
        1. Find a sum of all the numbers between 1 to 1000
        1. Find a sum of all even numbers between 1 to 1000
        1. Find a sum of all odd numbers between 1 to 1000
         */

        // int sum= 1+2+3+4+5+6+7......10000;
        //          i1+i2+i3+i4+i5.....

        // task01
        int sum1=0;
        for(int i=1; i<=1000; i++){ //i: 1~1000
           sum1+=i;
        }
        System.out.println("Sum of all numers: "+sum1);


        System.out.println("=================================================================");

        // task02
        int sum2=0;
        for(int i=1; i<=1000; i++) { //i: 1~1000
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println("Sum of all even numbers: "+sum2);

        // Another way to get the sum of the even number

        int Sum2=0;
        for(int i=2; i<=1000; i+=2){
            Sum2+=i;
        }
        System.out.println("Sum of all even numbers: "+Sum2);

        System.out.println("=================================================================");

        // task03

        int sum3=0;
        for(int i=1; i<=1000; i++){
            if(i%2==1){
                sum3+=i;
            }
        }
        System.out.println("Sum of all odd numbers: "+sum3);


        int Sum3=0;
        for(int i=1; i<=1000; i+=2){
            Sum3+=i;
        }
        System.out.println("Sum of all odd numbers: "+Sum3);









    }
}
