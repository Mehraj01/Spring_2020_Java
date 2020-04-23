package day02_Variables;

public class Variables {
    public static void main(String[] args) {

        /* Declare variables:
        DataType variableName=Data;
         */

        byte l=4;
        byte w=2;
        byte area=8;

        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        //Byte accept =128 and 127 max numbers
        //(No) byte num1=130;     Exceeds the range of byte
        // (No) byte num=2.5; byte, short, int, long they only accept whole numbers

        short num3=1000;
        //short
        System.out.println(num3);

        int a=12345;
        System.out.println(a);
        int u2=1000000000;
        System.out.println(1000000000);

        //int: preferred primitive variable

        long n3=99999999999l; // out of int': compiler by default takes it as int
        //We adding L to end of the numbers forcefully telling compiler that this it long data number

        System.out.println(n3);

        System.out.println(999999999999L);


        //double>float>long>int>short>byte
        short s1=10;
       // byte b1=s1; larger one cant assign to the shorter one
        //smaller one can assign to the larger one
        int i1=s1;

        System.out.println(i1);

        System.out.println(3.5);
        double d1=3.5;

        //float f1=4.5; // double primitive is larger than float primitive

        float f2=5.5f;
        System.out.println(f2);

        //float: You have to add f end of the number to let float that its double number


        System.out.println("===============================================================");

        float pi=2.14f;

        double p=3.14f;

        int a1=3000;
        double d2=a1;

        System.out.println(d2);
        long l2=40;
        float f3=12;









    }
}
