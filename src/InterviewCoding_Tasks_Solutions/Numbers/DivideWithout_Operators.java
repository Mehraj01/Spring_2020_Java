package InterviewCoding_Tasks_Solutions.Numbers;

public class DivideWithout_Operators {

    public static void main(String[] args) {

        divides(4,2);
        divideNoOperators(4,2);

    }


//Write a method that can divide two numbers without using division operator
    public static void divides(int num1, int num2) {

        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }

        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;//10-3=7-3=4-3=1 ==> num1 ==> 1
            count++;// this will count how many times numbers will be divided
        }

        System.out.println(count+" and remainder is: "+num1);

    }


    public static void divideNoOperators(int num1, int num2) {

        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        int count=0;
        for(int i=num1; i>=num2; i-=num2){
            count++;
        }
        System.out.println(num1+"/"+num2+"="+count);

    }

}
