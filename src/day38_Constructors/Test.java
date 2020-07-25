package day38_Constructors;

public class Test {

    public Test(){
        System.out.println("Constructor");
    }

    static{// its belong to class member because of that it will execute one time
        System.out.println("Static Block");
    }


    {
        // instance block executing depend on the object
        //if dont have object instance block will not executed
        System.out.println("Instance Block");

        // instance block runs before the constructor
    }


    public static void main(String[] args) {
        System.out.println("Main Method");// it will print first
        new Test();// instance, constructor
        System.out.println("Main Method");// when here it will print last
       // new Test();// instance, constructor
    }
}
