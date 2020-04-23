package day21_MultiDimensional_Arrays;

import java.text.DecimalFormat;

public class Formating_Decimal {
    public static void main(String[] args) {

        DecimalFormat DF=new DecimalFormat("0.00");// rounding the decimals.//result: 3.33
       // DecimalFormat DF=new DecimalFormat();//result: 3.333

        double a=10.0/3.0;
        System.out.println(a);
        System.out.println(DF.format(a));

        System.out.println(2.3467899);
        System.out.println(DF.format(2.3467899));// when you round the number u hav to check the
        // second and third decimol. if its bigger it will be rounded to the bigger number.




    }
}
