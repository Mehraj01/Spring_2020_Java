package day04_JavaRecap;

public class AritmeticOperators {
    public static void main(String[] args) {

        //10/3=3.33333...
        int a=10/3;//3
        System.out.println(a);

        //10/4=2.5
        System.out.println(10/4);//2

        double d=10/4;//int(10/4) always return you whole number
        //if it was 10.0/4 or 10.0/4.0 it would return us decimal number
        // double d=2
        // oputpu d==>2.0
        System.out.println(d);//2.0

        System.out.println(10.0/4);//2.5

        System.out.println(10/4.0);//2.5

        System.out.println(10.0/4.0);//2.5

        //10/4=2.5
        float f1=10/4;
        //float f1=2;
        System.out.println(f1);//2.0


        boolean evenNumber=25%2==0;//remainder is 1 (and its a odd number)
        //if 25 can divide by 2 and has a remainder zero, then its even number
        System.out.println(evenNumber);//false
        System.out.println(25%2);

        boolean oddNumber=22%2!=0;//odd number because 22 actually even number
        // 0!=0==>false
        System.out.println(oddNumber);

        System.out.println(10%2==0);//10 is even number
        System.out.println(11%2!=0);//11 is odd number

        System.out.println("10 is even number: "+(10%2==0));
        System.out.println("11 is even number: "+(11%2==0));
        System.out.println("25 is odd number "+(25%2!=0));
        System.out.println("25 is odd number "+!(25%2!=0));
        System.out.println("25 is odd number "+(15%2==0));




        char ch;
        ch='A';
        System.out.println(ch);

        ch=85;
        System.out.println(ch);

        ch=52;
        System.out.println(ch);
















    }
}
