package day47_Abstraction;

class Test1{
    public Test1(){ }
    public void method1(){}
    public static void method2(){}
    //public abstract void method3();// in regular class we cant use abstract method.

    int a=100;
    static int b=2000;

    {// instance block

    }

     static {

     }


}




abstract class Test2{ // we cant create object in abstract class
    public Test2(){}
    public void method1(){}
    public static void method2(){}
    public abstract void method3();

    {//instance block

    }

    static{

    }

}

public class Abstract_VS_NonAbstract {
}
