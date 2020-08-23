package MyOwnLibrary.CODES;

import java.util.Scanner;

public class JavaBasics {


}
//**********************************************************************************************************************
class char_{
    public static void main(String[] args) {

        //-> Character: char, ''  -> every char has a number

        int a='a'+'b'; // 97+98 // when we assign char to int we will get the corresponding numbers
        System.out.println(a);
        boolean r1 ='a'==97; //97==97==>true //lower case 'a' ==97 because of that we will get true when we assign it to boolean
        System.out.println(r1);


        char ch;
        ch='A'; // ==> will print A because we assign it to char
        System.out.println(ch);

        ch=85; //==> it will print corresponding Char which is U
        System.out.println(ch);

        ch=52; //==> Will print 4 because in Ascii table in number 52 locate number 4
        System.out.println(ch);

        double d1='z'+'8';//122+56=178.0
        System.out.println(d1);

        char ch1='$'; // every single character has a corresponding number
        System.out.println(ch1); //$

        System.out.println('a'=='b'-1);//true ==> 97==98-1


    }
}
//**********************************************************************************************************************
class Primitive_Casting{
    public static void main(String[] args) {

        // Implicit casting: casting smaller primitives to larger primitives
        //implicit casting: there done automatically
        int a1=100;
        long b1=(long)a1;// we dont need long there because comelier do it automatically


        //Explicit casting: casting larger primitive type to smaller primitives type
        //casting has to be same or smaller than the DataType
        int a3=100;
        short b3=(byte)a3; //casting has to be same or smaller than the DataType

        double d3=5.5;
        float f3=(int)d3;//5.5
        //float f3=(float)d3;//5.5
        //float f3=(long)d3;//5.0
        //float f3=(int)d3;//5.0
        System.out.println(f3);//5.0 ->  // because we cast it to int

        double D1=10.5;
        long L1=(int)D1; // 10
        System.out.println(L1);
        //long L1=(Long)(float)D1);

        float F1=60.5f;
        int I1=(short)F1;
        System.out.println(I1);// 60 -> will convert it to int
        //casting has to be same or smaller than the DataType

        long largeNum=9999999999999999L;
        int intNum=(int)largeNum;//It gives number. Because 999999999999999999 number is out of int' range
        System.out.println(intNum); //output: 1874919423

        char ch1='a';
        short sh1=(short)ch1;
        System.out.println(sh1); // 97  --> In Ascii table 'a' corresponding number is 97

        char ch2=23456;
        double dbl1=ch2;//23456.0
        System.out.println(dbl1);


        //Type |	Size (bits) |	Minimum	 |  Maximum          |  Example
        //byte        8	             -27	    27– 1	          byte b = 100;
        //short	      16	         -215	    215– 1	          short s = 30_000;
        //int	      32	         -231	     231– 1	          int i = 100_000_000;
        //long	      64	         -263	     263– 1           long l = 100_000_000_000_000;
        //float	      32	         -2-149	    (2-2-23)·2127	  float f = 1.456f;
        //double	  64	         -2-1074	(2-2-52)·21023	   double f = 1.456789012345678;
        //char	      16	            0	      216– 1	       char c = ‘c';
        //boolean	   1	             –	         –	           boolean b = true;


    }
}
//**********************************************************************************************************************
class Post_Pre_{
    public static void main(String[] args) {

        //pre: It changes the value immediately
        //Post: first passes current value,then eventually changes the variable' value

        int a = 50;
        a = --a +  a++  +  a--  + a++;
        // a =  49  +  49   +  50  + 49  = 197
        System.out.println(a);  // 197
        System.out.println( ++a );  // 198
        System.out.println( a++ );  // 198
        System.out.println( a ); // 199


        int b =1;
        b  =  -b--  + b++  / -b--  * --b;
        //  -1   +  0  / - 1   *  -1
        // -1 + 0 * -1
        //  -1 + 0 = -1


        int c = 200; // 199
        int d = -c++ +  - --c *  c-- % 2;
        // c =  -200  +  -200  * 200 % 2
        //  c =  -200 + -40000  %  2
        //  c =  -200 + 0
        // c = -200;
        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z =  x  +   y   -  x * y + x / y;
        //  z = 300 +  400  - 300 * 400 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400             300/400 ==> 0.75;
        // z = 300 + 400 - 120000 + 0
        // z = 700 - 120000 = -119300
        System.out.println(z);


    }
}
//**********************************************************************************************************************
class convert_Gallons_Liters{
    public static void main(String[] args) {
        /*
        -> Gallon -> Liter
        1 gallon = 3.785 liters
        10 gallon * 3.785 liters = 37.85 liters

        -> liter  -> Gallon
        Gallon * 0.264
         */

        double numberOfGallons = 10;
        double gallonsToLiters = numberOfGallons * 3.785;
        String result = numberOfGallons + " gallons equal to: " + gallonsToLiters+" liters";
        System.out.println(result);

        System.out.println("===================================================================");

        double numberOfLiters = 10;
        double litersToGallons =  numberOfLiters / 3.785;
        String result2 = numberOfLiters+" liters equal to "+litersToGallons+" gallons";
        System.out.println(result2);
    }
}
//**********************************************************************************************************************
class leapYear{
    public static void main(String[] args) {
        /*
        1. create a class called LeapYear, and write a program that can identify if the given is Leap Year,
        print true if it's leap year, otherwise print false
        Ex: ==> year = 2020
        output: ==> 2020 is leap year: true
         */

        //If the year can be divided by 4 without any remainder, then it's leap year


        int year=2020;
        //LeapYear: year%4==0;
        //It returns true==>LeapYear,  if returns false ==>not leapYear
        boolean LeapYear=2020%4==0;
        //System.out.println(year+ " Leap Year is: "+LeapYear);
        String result=year+ " Leap Year is: "+LeapYear;
        System.out.println(result);
    }
}
//**********************************************************************************************************************
class timer{
    public static void main(String[] args) throws Exception {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();
        for (int i=minutes; i > 0 ;--i) {
            if( i< 0 )
                break;
            for (int z=59; z >0 ; --z) {
                System.out.println((i-1)+" minutes and "+z+" seconds left");
                Thread.sleep(1000);
            }
        }
        System.out.println(" \n \t \t********************************************* ");
        System.out.println("  \t \t***                                       *** ");
        System.out.println("   \t \t***  Times is Up, Please take your seats! *** ");
        System.out.println("    \t \t***                                       *** ");
        System.out.println("     \t \t********************************************* ");
    }
}
//**********************************************************************************************************************
class DaysInMonth_MultiBranch_If {
    public static void main(String[] args) {

        byte months = 1;
        String result = " ";

        if (months == 1) {
            result = "January has 31 days";
        } else if (months == 2) {
            result = "Feburary has 28 or 29 days";
        } else if (months == 3) {
            result = "March has 31 days";
        } else if (months == 4) {
            result = "April has 30 days";
        } else if (months == 5) {
            result = "May has 31 days";
        } else if (months == 6) {
            result = "June has 30 days";
        } else if (months == 7) {
            result = "July has 31 days";
        } else if (months == 8) {
            result = "August has 31 days";
        } else if (months == 9) {
            result = "September has 30 days";
        } else if (months == 10) {
            result = "October has 31 days";
        } else if (months == 11) {
            result = "November has 30 days";
        } else if (months == 12) {
            result = "December has 31 days";
        } else {
            result = "Invalid Entry";
        }

        System.out.println(result);

    }
}
//**********************************************************************************************************************
class Days_In_Month {
    public static void main(String[] args) {

        byte month=2;

        boolean days28=month==2;
        boolean days30=month==4 || month==6 || month==9 || month==11;
        boolean days31=days28==false && days30==false;
        //boolean days31= !days28 && !days30;

        int days=0;
        int daysTernary=0;

        if(days28){
            //System.out.println("it has 28 days");
            days=28;
        }
        if(days30){
            //System.out.println("it has 30 days");
            days=30;
        }
        if(days31){
            //System.out.println("it has 31 days");
            days=31;
        }
        System.out.println("it has a "+days+" days");


    }
}
//**********************************************************************************************************************
class Days_InA_Week{
    public static void main(String[] args) {

        int num=3;
        String result="";

        if(num>0 && num <8){
            if(num==1){
                result="Monday";
            }else if(num==2){
                result="Tuesday";
            }else if(num==3){
                result="Wednesday";
            }else if(num==4){
                result="Thursday";
            }else if(num==5){
                result="Friday";
            }else if(num==6){
                result="Saturday";
            }else if(num==7){
                result="Sunday";
            }

        }else{
            result="Invalid";
        }
        System.out.println(result);




     //  Second and shorter way with Ternary
        String result2="";

        result2=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday"
                :(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":(num==7)?"Sunday": "Invalid";

        System.out.println(result2);


        System.out.println("===========================================");
          /*
        2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
         */


        int days=7;
        boolean totals=days>0 && days<8;
        String result1="";

        if(totals){
            if(days==1){
                result="Monday";
            }else if(days==2){
                result="Tuesday";
            }else if(days==3){
                result="Wednesday";
            }else if(days==4){
                result="Thursday";
            }else if(days==5){
                result="Friday";
            }else if(days==6){
                result="Saturday";
            }else{
                result="Sunday";
            }

        }else{
            result="Invalid";
        }
        System.out.println(result);

        System.out.println("================================================");

        /*
         Write a program that will print a week day according to the day number. Use switch statement.
         Example
         Display message: "Enter number:"
         1
         Display message: "Monday"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number:");

        int weekday=scan.nextInt();// user will add the input so I assign it to int variable
        String result3="";

        switch(weekday){
            case 1:
                result3="Monday";
                break;
            case 2:
                result3="Tuesday";
                break;
            case 3:
                result3="Wednesday";
                break;
            case 4:
                result3="Thursday";
                break;
            case 5:
                result3="Friday";
                break;
            case 6:
                result3="Saturday";
                break;
            case 7:
                result3="Sunday";
                break;
            default:
                result3="There is no such a day";

        }
        System.out.println(result3);



    }
}
//**********************************************************************************************************************
class Ternary{
    public static void main(String[] args) {


        byte month=2;

        boolean days28=month==2;
        boolean days30=month==4 || month==6 || month==9 || month==11;
        boolean days31=days28==false && days30==false;
        //boolean days31= !days28 && !days30;

        int days=0;
        // we can only apply ternary: if the if statement' body is only returning value and assigning it to variable
        // then we can apply ternary
        int daysTernary=(days28)?days=28:(days30)?days=30:(days31)?days=31:0;
        System.out.println("it has a "+daysTernary+" days");


        int number = 12000;
        boolean divisibleBy3And5 = (number % 3 ==0 && number % 5 ==0 ) ? true : false;
        System.out.println(divisibleBy3And5);

    }
}
//**********************************************************************************************************************
class RateCalculator {
    public static void main(String[] args) {

        /*
        write a program for the rate calculator: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
         */

        Scanner rate = new Scanner(System.in);

        System.out.println("Enter Your salary: ");
        int salary = rate.nextInt();

        System.out.println("Enter how many hours you work in a week: ");
        int hoursInWeek = rate.nextInt();

        System.out.println("How many weeks do you work in a year?");
        int totalWeeks = rate.nextInt();

        //HourlyRate=(salary/numberOfWeeks)/weeklyHours

        System.out.println("Your Hourly Rate is: " + ((salary / 52) / hoursInWeek));


    }
}
//**********************************************************************************************************************
