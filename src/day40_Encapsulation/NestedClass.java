package day40_Encapsulation;

public class NestedClass {


    static class data{
        static int a = 100;
        static int b = 300;

    }

    public static void main(String[] args) {

        System.out.println( NestedClass.data.a );
        System.out.println(NestedClass.data.b);

    }


}
