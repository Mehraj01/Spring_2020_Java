package day05_Unary_ShorthandOperators;

public class LeapYear {
    public static void main(String[] args) {

        /*
        1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
         */

        short year=2020;
        //LeapYear: year%4==0;
        //It returns true==>LeapYear,  if returns false ==>not leapYear
        boolean LeapYear=2020%4==0;
        //If the year can be divided by 4 without any remainder, then it's leap year
        //System.out.println(year+ " Leap Year is: "+LeapYear);

        String result=year+ " Leap Year is: "+LeapYear;
        System.out.println(result);

        /*

    2. write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
         */

        int number=65;
        boolean num1=65%2==0;
        boolean num2=65%3==0;
        boolean num3=65%5==0;

        System.out.println(number+" is divisible by 2: "+num1);
        System.out.println(number+(" is divisible by 3: "+num2));
        System.out.println(number+(" is divisible by 5: "+num3));

        /*
         output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
         */

        int num=80;
        boolean n1=80%2==0;
        boolean n2=80%3==0;
        boolean n3=80%5==0;
        //System.out.println(num+" is divisible bye 2: "+n1);
        //System.out.println(num+" is divisible is by 2: "+n2);
       // System.out.println(num+" is divisible is by 2: "+n3);
        String result1=num+" is divisible is by 2: "+n1;
        String result2=num+" is divisible is by 2: "+n2;
        String result3=num+" is divisible is by 2: "+n3;
        //System.out.println(result1+"\n"+result2+"\n"+result3);
        String finalresult=result1+"\n"+result2+"\n"+result3;
        System.out.println(finalresult);






    }

}
