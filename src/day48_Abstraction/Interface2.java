package day48_Abstraction;

public interface Interface2 {
    // we can static and final variables in interface
    //because instance belongs to object. And Object comes from class. Interfaces is not class
    // constructor belongs to class. Interface cant have constructor

    public static final int a=100; // variable static by default

    public static void main(String[] args) {
        // instance dosent accepts in static but in interface it static by default

        System.out.println(a);// variable static by default
        //a=200; we cant reassign  it because it is static and final by default


        System.out.println(Interface2.a);
        Interface2.method4();


    }

    public static void method4(){

    }

     void method5();

    public default void method6(){//default method // Default method can be inherited only interface

    }
}
