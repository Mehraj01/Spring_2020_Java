package day46_final_abstract;
// contractor and blocks cannot be final
// final method cannot be overriding
public class final_Practices {
    final int a = 10;
    final static int b= 20;

    {
        System.out.println(a);
        //  a = 20; // cannot be reassigned
    }

    static{
        System.out.println(b);
        //  b = 30;
    }

    public final_Practices(){

    }

    final void method1(){

    }

    public final static void method2(){

    }

    private final int method1(int a){
        return 12;
    }

    public final static void method2(int a){

    }
}
