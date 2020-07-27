package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //implicit casting: there done automatically
        int a=10;
        long b=a;
        //b=10L Its internally converted to double. Implicit casting is done automatically

        int a1=100;
        long b1=(long)a1;// we dont need long tthere because complier do it automatically

        //int c1=b1;

        //Explicit casting:

        int a3=100;
        byte b3=(byte)a3;

        short c3=(short)a3;

        double d3=5.5;
        float f3=(int)d3;//5.5
        //f3=(int)5.5
        //f3=5;
        System.out.println(f3);//5

        System.out.println(f3);

        double D1=10.5;
        long L1=(int)D1;
        System.out.println(L1);
        //long L1=(Long)(float)D1);

        float F1=60.5f;
        int I1=(int)F1;

        long largeNum=9999999999999999L;
        int intNum=(int)largeNum;//It gives number. Because 999999999999999999 number is out of int' range

        System.out.println(intNum);


        char ch1='a';
        short sh1=(short)ch1;

        System.out.println(sh1);

        char ch2=23456;
        double dbl1=ch2;//23456.0
        System.out.println(dbl1);

        int z1=10;
        double t1b=z1;//10.0
        short y1=(byte)z1;
        System.out.println(y1);











    }
}
