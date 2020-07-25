package day50_Polymorphism;

interface I{

    // interface we can use final and static.
    // we can use only public on interface

    void method2();// public abstract by default
    abstract int method3();// it is abstract by default in interface class


  //  public I(){}

   // public void m(){}

   // {  }

   // static{  }

    int a=1000; // by default is public static and final. It is not instance

    public static void main(String[] args) {

        System.out.println(a);
       // a=2000; by default it is final. we can not assign it
    }


}


abstract class A{

    {  }

    static{ }

    public A(){  }

   protected abstract void method1();
    public void method4(){}


}

public class Abstraction extends A implements I {

    //public abstract void method1();

    @Override
    public  void method1(){

    }


    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

}
