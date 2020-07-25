package day47_Abstraction;

abstract class A{

    public abstract void method1();
    public void method2(){}

}


public class Abstract_VS_NonAbstract2 extends  A { // Mandatory to override the abstract method
    // in regular class we can not have abstract class
    @Override
    public void method1(){}


}
abstract class B extends A{// optional to override the abstract method of A

    // one abstract one instance method

    // public abstract void method1();



        }
class C extends B{
    public void method1(){

    }
}