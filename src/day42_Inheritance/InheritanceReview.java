package day42_Inheritance;
/*

>>>> Inheritance: sub class & super class

      --  Sub class: ==> can INHERIT visible variables and visible methods from SUPER CLASS

                private: can never be inherited in sub class
                default: can be inherited as long as sub class is in the same package
                public & protected: can always be inherited to any sub class

                in same package: public, protected, default can be inherited
                different package: public & protected can be inherited


      --  Super class: ==> CANNOT INHERIT anything from SUB CLASS

                ONE class can only EXTEND one class
                one class can be extended by multiple classes

     --   CONSTRUCTOR CANNOT BE INHERITED
 */

class B{
    public B(int a){
        System.out.println("int");//*
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        this(4.5);// calls double
        System.out.println("long");
        //super(4.5); B dosent have parent class because of that we cant use super keyword

    }
}

public class InheritanceReview extends B {

    public InheritanceReview(String a){
        super(10l);// By default 10 is Integer. Because of that it will take int argument not long
                      // if we add l end of the number it will print long parameter constructor ==>  super(10l);
        System.out.println("String"); //*
    }

    public static void main(String[] args) {
        InheritanceReview obj=new InheritanceReview("Hello"); // output: int, String


    }

}
