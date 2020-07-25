package day35_Static;

public class staticVariables {

    int a2=200;//instance variable

    static int a3=300;// static variable

    public static void main(String[] args) {
        int a1=100; // local variable


        staticVariables obj1=new staticVariables();
        obj1.a2=1000;
        staticVariables obj2 = new staticVariables();
        obj2.a2 = 2000;

        obj2.a3 = 5000;


        System.out.println( obj1.a2 );
        System.out.println( obj2.a2 );

        System.out.println( obj1.a3 ); // 5000
        System.out.println( obj2.a3 ); // 5000



    }
}
