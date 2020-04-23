package day03_VariablesContinue;

public class ArithmaticOperators {

    public static void main(String[] args) {
        /*

        Arithmatic operators:
        + : addition
                - : subtraction
                * : multiplication
                / : division
                % : remainder

         */

        System.out.println(5+3);//8
        System.out.println(10-2);//8
        System.out.println(10*3);//30

        System.out.println(10/2);//5
      //  System.out.println(30/0);
        //in mathematic, the denominator cannot be
        // a number cannot be divided by 0

        //10/4=2.5
        //remainder: numenator-(denominator*result wholenumber)


        int result1=10%3;//1
        int result2=11%3;//2
        System.out.println(result1);
        System.out.println(result2);


        int c1=10/4;

        System.out.println(c1);//2

        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5

        double d1=10/4;

        System.out.println(d1);//2.0 (because its not decimal number because of even we declare it with double datatype it will orint  2.0

        double d2=10/4.0f;
        System.out.println(d2);



    }
}

