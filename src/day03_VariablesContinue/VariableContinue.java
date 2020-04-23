package day03_VariablesContinue;

public class VariableContinue {
    public static void main(String[] args) {
        /*

        comparision operators:
		>: greater
                >=: greater or equal
                <: less
                <=: less or equal
                == : equal
                != : not equal

         */


        boolean result1=true;
        boolean result2=false;


        boolean result3=10>9; //true
        System.out.println(result3);

        System.out.println(true==false);

        System.out.println("Muhtar"=="Good Guy");
        //bd guy==good guy==>true

        System.out.println("Muhtar"!="Good guy");
        //bd guy!=good guy===>false

        boolean r1=true!=true; //false
        System.out.println(r1);//false

        boolean r2="Batch 17"=="Batch 18"; //false
        System.out.println(r2);

        System.out.println("===========================================");

        char ch1='A';
        System.out.println(ch1);


        char ch2=45000;

        System.out.println(ch2);

        char ch3=100;//d
        System.out.println(ch3);

        char cr5='D';//68
        System.out.println(cr5);

        int num1='D';//number,
        System.out.println(num1);

        char a1='z'; //char is larger than byte
        byte b1='z';

        System.out.println(b1);


        //short s1= a1; // char is larger that short
        int i1=a1; //int is larger than char




    }
}
