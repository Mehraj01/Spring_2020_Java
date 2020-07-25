package day38_Constructors;

public class ConstructorCall2 {

    public ConstructorCall2(){
        System.out.println("Default constructor");

    }

    public ConstructorCall2(int a){
       this();// Default constructor.// when u dont pass parameter it will call default constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCall2(String str){
        // constructor call supposed to be first in the method.
        this(10);// default , & with int argument
        System.out.println("Constructor with String Argument");

        // one constructor only can call one constructor

    }



    public static void main(String[] args) {
        ConstructorCall2 obj=new ConstructorCall2(("Hello"));
    }




    public void method(){
         // constructor cant be call with name
    }


    {
       // this is a Instance Block
    }

}
