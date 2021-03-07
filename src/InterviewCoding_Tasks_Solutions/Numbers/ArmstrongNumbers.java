package InterviewCoding_Tasks_Solutions.Numbers;

public class ArmstrongNumbers {

    public static void main(String[] args) {
//Write a method that can check if a number is Armstrong  number
        boolean a=ArmStrongNumber(370);
        System.out.println(a);

    }

    public  static  boolean ArmStrongNumber (int  num) {

 //An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
 //Some examples are: 370 = 3*3*3=27 + 7*7*7=343 + 0*0*0=0 ==> 370
 // 1634 ==> 1*1*1*1=1 + 6*6*6*6=1296 + 3*3*3*3=81 + 4*4*4*4=256 ==> total 1634

        int a = 0;
        int b =0;
        int c=num;

        while(num>0){
            a=num%10;//a= 371%10=1, a= 37%10=7  a= 3/10=0 ==> 1, 7, 3
            //System.out.println("a="+a);
            num/=10;//num=371/10=37, num=37/10=3, num=3/10=0   ==> 37, 3, 0
            //System.out.println("Num="+num);
            b=b+(a*a*a);//b= 1*1*1=1, b= 7*7*7=343, b= 3*3*3=27  ==> 1+343+27
            //System.out.println("b="+b);
        }

        if(c==b) {
            return true;
        }

        return false;

    }
}
