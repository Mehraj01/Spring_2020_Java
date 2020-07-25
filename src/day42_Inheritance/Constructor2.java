package day42_Inheritance;

class Test{

    public Test(int a){
        this(2.5);// It calls constructor with double parameter // C
        System.out.println("A");
    }

    public Test(double a){
        System.out.println("C");
    }

}

public class Constructor2 extends Test {

        public Constructor2(){ // * when we have PARAMETER in super class constructor we have to call
                              // Super class constructor by using SUPER key word
           super(10);
            System.out.println("B");
        }


    public static void main(String[] args) {

            Test obj=new Test(15);// This calls Super class constructor
            // * output: A // Because it is the Test obj

           // Constructor2 obj2=new Constructor2(); * // output: A B // Because it is the Constructor2 obj
    }

    }

